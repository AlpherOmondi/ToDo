package com.alpha.todo.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

// annotation creates a table.
@Entity(tableName = "task_table")
// this annotation enables data to be passed from one fragment to another.
@Parcelize
data class Task(
    val taskName: String,
    val isImportant: Boolean,
    val isCompleted: Boolean,
    val dateCreated: Long,
    //annotation enables each task to be unique
    @PrimaryKey(autoGenerate = true) val taskId: Int
) : Parcelable {
    val formattedDateCreated
        get() = DateFormat.getDateTimeInstance().format(dateCreated)
}
