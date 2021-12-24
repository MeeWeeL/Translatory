package com.meeweel.translatory.presenter

import com.meeweel.translatory.model.data.AppState
import com.meeweel.translatory.view.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)
    // Получение данных с флагом isOnline(из Интернета или нет)
    fun getData(word: String, isOnline: Boolean)
}