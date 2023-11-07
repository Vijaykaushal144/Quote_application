package com.example.mvvmdemo.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmdemo.repository.QuoteRepository
import com.example.mvvmdemo.Model.Quotedtclss
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes(): LiveData<List<Quotedtclss>> {
        return quoteRepository.getQuotes()
    }

    fun insertQuote(quote: Quotedtclss) {
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.insertQuote(quote)
        }
    }
}