package kz.assylkhanov.mvvm.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * @author a.asylkhanov
 */
@Database(entities = [PostEntity::class], version = 3)
abstract class MyDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}
