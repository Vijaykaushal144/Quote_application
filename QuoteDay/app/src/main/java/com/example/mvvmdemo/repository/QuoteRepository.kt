package com.example.mvvmdemo.repository

import androidx.lifecycle.LiveData
import com.example.mvvmdemo.Dao.QuoteDao
import com.example.mvvmdemo.Model.Quotedtclss

class QuoteRepository(val quoteDao: QuoteDao) {
    fun getQuotes():LiveData<List<Quotedtclss>>{
        return quoteDao.getQuote()
    }
    suspend fun insertQuote(quote: Quotedtclss)
    {
        quoteDao.insertQuotw(quote)
    }
}