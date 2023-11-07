package com.example.mvvmdemo.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmdemo.Dao.QuoteDao

@Database(entities = [Quotedtclss::class],version =1)
abstract class QuoteDataBase: RoomDatabase() {
    abstract fun quoteData(): QuoteDao

    companion object {
        private var INSTANCE: QuoteDataBase?=null
        fun getDataBase(context: Context): QuoteDataBase {
            if(INSTANCE == null)
            {
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(
                        context,
                        QuoteDataBase::class.java,
                        "quote_database"
                    ).createFromAsset("quotes.db")
                        .build()
                }
            }
           return INSTANCE!!
        }
    }
}