package com.alpha.todo.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

@Entity(tableName = "task_table")
@Parcelize
data class Note(
    val taskName: String,
    val isImportant: Boolean,
    val isCompleted: Boolean,
    val dateCreated: Long,
    @PrimaryKey(autoGenerate = true) val taskId: Int
):Parcelable{
    val formattedDateCreated
        get() = DateFormat.getDateTimeInstance().format(dateCreated)
}
