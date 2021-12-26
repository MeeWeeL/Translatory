package com.meeweel.translatory.model.datasource

import com.meeweel.translatory.model.data.DataModel
import com.meeweel.translatory.model.datasource.room.RoomDataBaseImpl
import io.reactivex.Observable

class DataSourceLocal(private val remoteProvider: RoomDataBaseImpl = RoomDataBaseImpl()) :
    DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> = remoteProvider.getData(word)
}
