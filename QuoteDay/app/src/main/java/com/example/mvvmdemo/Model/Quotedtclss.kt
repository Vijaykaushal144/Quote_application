package com.example.mvvmdemo.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Quotedtclss(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val text:String,
    val author:String
)
