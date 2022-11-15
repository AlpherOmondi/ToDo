package com.alpha.todo.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.DateFormat

@Entity(tableName = "task_table")
data class Note(
    val taskName: String,
    val isImportant: Boolean
    val isCompleted: Boolean,
    val dateCreated: Long,
    @PrimaryKey(autoGenerate = true) val taskId: Int
) {
    val formattedDateCreated
        get() = DateFormat.getDateTimeInstance().format(dateCreated)
}
