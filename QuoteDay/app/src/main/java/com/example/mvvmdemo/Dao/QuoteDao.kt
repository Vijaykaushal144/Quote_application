package com.example.mvvmdemo.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvmdemo.Model.Quotedtclss

@Dao
interface QuoteDao {
    @Query("SELECT * FROM quote")
    fun getQuote():LiveData<List<Quotedtclss>>

    @Insert
   suspend fun insertQuotw(quote: Quotedtclss)
}