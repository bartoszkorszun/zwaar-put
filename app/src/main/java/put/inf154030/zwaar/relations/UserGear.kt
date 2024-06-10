package put.inf154030.zwaar.relations

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import put.inf154030.zwaar.entities.Gear
import put.inf154030.zwaar.entities.User

@Entity(tableName = "user_gear")
data class UserGear(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo("user_id") val userId: Int,
    @ColumnInfo("gear_id") val gearId: Int
)
