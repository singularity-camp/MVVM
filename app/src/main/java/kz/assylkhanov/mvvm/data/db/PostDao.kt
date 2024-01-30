package kz.assylkhanov.mvvm.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * @author a.asylkhanov
 */
@Dao
interface PostDao {

    @Query("SELECT * FROM PostEntity")
    fun getAllPosts(): Flow<List<PostEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addPost(post: PostEntity)

    @Delete
    fun deletePost(post: PostEntity)
}
