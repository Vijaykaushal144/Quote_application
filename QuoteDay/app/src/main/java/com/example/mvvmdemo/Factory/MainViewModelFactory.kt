package com.example.mvvmdemo.Factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.repository.QuoteRepository
import com.example.mvvmdemo.ViewModel.MainViewModel

class MainViewModelFactory(private val quoteRepository: QuoteRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(quoteRepository) as T
    }
}