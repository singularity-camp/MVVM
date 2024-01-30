package kz.assylkhanov.mvvm.di.example

import android.util.Log

class AnalyticsSender(
    private val screenName: String,
    private val param: ClassWithSeveralParams
) {
    fun execute() {
        param.execute()
        // имитация отправки аналитики
        Log.d("ClassWithExternalParam", "$screenName opened")
    }
}
