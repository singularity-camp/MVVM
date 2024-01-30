package kz.assylkhanov.mvvm.di.example

class RoomDatabase : Database {
    override fun getUsers(): List<String> {
        return listOf("1", "2", "3")
    }
}

class RealmDatabase : Database {
    override fun getUsers(): List<String> {
        return listOf("4", "5", "6")
    }
}
