package com.josersi.todoapp.model

data class Task(
    val title: String,
    val hour: String,
    val date: String,
    val id: Int = 0
)