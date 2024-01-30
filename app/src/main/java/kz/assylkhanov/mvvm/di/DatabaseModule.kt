package kz.assylkhanov.mvvm.di

import androidx.room.Room
import kz.assylkhanov.mvvm.data.db.MyDatabase
import kz.assylkhanov.mvvm.data.db.PostDao
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * @author a.asylkhanov
 */
val dbModule = module {
    single<MyDatabase> {
        Room.databaseBuilder(androidContext(), MyDatabase::class.java, "my_db")
            .fallbackToDestructiveMigration()
            .build()
    }
    factory<PostDao> {
        val db: MyDatabase = get()
        db.postDao()
    }
}
