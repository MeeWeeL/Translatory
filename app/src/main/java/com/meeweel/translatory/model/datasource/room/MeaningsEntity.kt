package com.meeweel.translatory.model.datasource.room

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import com.meeweel.translatory.model.data.Translation

@Entity
data class MeaningsEntity(

    val translation: String = "",
    val imageUrl: String = ""
)