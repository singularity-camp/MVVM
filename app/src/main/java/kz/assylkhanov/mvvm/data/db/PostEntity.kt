package kz.assylkhanov.mvvm.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author a.asylkhanov
 */
@Entity
data class PostEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
)
