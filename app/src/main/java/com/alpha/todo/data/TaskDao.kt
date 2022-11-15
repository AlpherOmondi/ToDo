package com.alpha.todo.data

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    //Create
    @Insert(onConflict = REPLACE)
    suspend fun insert(task:Task)
    //Read
    @Query("SELECT * FROM task_table")
    fun getAll(task:Task): Flow<List<Task>>
    //Update
    @Update
    suspend fun update(task: Task)
    //Delete
    @Delete
    suspend fun delete(task:Task)

}