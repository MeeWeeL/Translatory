package com.meeweel.translatory.model.datasource.room

import com.meeweel.translatory.model.App
import com.meeweel.translatory.model.data.DataModel
import com.meeweel.translatory.model.datasource.DataSource
import io.reactivex.Observable

class RoomDataBaseImpl : DataSource<List<DataModel>> {

    private val db = App.create().getEntityDao()

    override fun getData(word: String): Observable<List<DataModel>> {
        return db.getWordByText(word).flatMap {
            Observable.just(convertEntityListToDataModelList(it))
        }
    }
}