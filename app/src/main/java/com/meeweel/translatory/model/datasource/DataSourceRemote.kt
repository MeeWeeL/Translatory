package com.meeweel.translatory.model.datasource

import com.meeweel.translatory.model.App
import com.meeweel.translatory.model.data.DataModel
import com.meeweel.translatory.model.datasource.retrofit.RetrofitImpl
import com.meeweel.translatory.model.datasource.room.convertDataModelListToEntityList
import com.meeweel.translatory.model.datasource.room.convertDataModelToEntity
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class DataSourceRemote(private val remoteProvider: RetrofitImpl = RetrofitImpl()) :
    DataSource<List<DataModel>> {

    val db = App.create().getEntityDao()

    override fun getData(word: String): Observable<List<DataModel>> {
        db.getWordByText("week")
        val a = remoteProvider
            .getData(word).apply {
                this.subscribeOn(Schedulers.io()).observeOn(Schedulers.computation())
                    .subscribe({
                               db.insertList(convertDataModelListToEntityList(it))
                    },{})
            }
        return a
    }
}