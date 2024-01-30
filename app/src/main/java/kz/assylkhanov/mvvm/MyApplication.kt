package kz.assylkhanov.mvvm

import android.app.Application
import kz.assylkhanov.mvvm.di.dbModule
import kz.assylkhanov.mvvm.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author a.asylkhanov
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(mainModule, dbModule)
        }



    }
}
