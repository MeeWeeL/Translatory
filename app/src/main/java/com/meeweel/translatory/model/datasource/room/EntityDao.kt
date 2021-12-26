package com.meeweel.translatory.model.datasource.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.meeweel.translatory.model.data.DataModel
import io.reactivex.Observable
import io.reactivex.Single

@Dao
interface EntityDao {

    @Query("SELECT * FROM Entity")
    fun getAll(): Observable<List<Entity>>

    @Query("SELECT * FROM Entity WHERE text LIKE :text")
    fun getWordByText(text: String): Observable<List<Entity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(entity: Entity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertList(entities: List<Entity>)

}