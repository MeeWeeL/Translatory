package com.meeweel.translatory.model.repository

import com.meeweel.translatory.model.data.DataModel
import com.meeweel.translatory.model.datasource.DataSource
import io.reactivex.Observable

class RepositoryImpl(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {
    // Репозиторий возвращает данные, используя dataSource (локальный или
    // внешний)
    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}