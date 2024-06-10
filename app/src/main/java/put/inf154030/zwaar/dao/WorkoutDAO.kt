package put.inf154030.zwaar.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import put.inf154030.zwaar.entities.Workout

@Dao
interface WorkoutDAO {
    @Query("SELECT * FROM workouts WHERE user_id = :userId")
    suspend fun getAllUserWorkouts(userId: Int): List<Workout>

    @Insert
    suspend fun insertWorkout(workout: Workout)
}