package com.meeweel.translatory.view.base

import com.meeweel.translatory.model.data.AppState

interface View {
    // View имеет только один метод, в который приходит некое состояние приложения
    fun renderData(appState: AppState)

}