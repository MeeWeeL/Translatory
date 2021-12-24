package com.meeweel.translatory.model.datasource

import com.meeweel.translatory.model.data.DataModel
import io.reactivex.Observable

class RoomDataBaseImpl : DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.
    }
}