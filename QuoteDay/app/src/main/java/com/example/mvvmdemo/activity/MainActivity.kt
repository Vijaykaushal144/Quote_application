package com.example.mvvmdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.ViewModel.MainViewModel
import com.example.mvvmdemo.Factory.MainViewModelFactory
import com.example.mvvmdemo.Model.QuoteDataBase
import com.example.mvvmdemo.repository.QuoteRepository
import com.example.mvvmdemo.Model.Quotedtclss
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val dao = QuoteDataBase.getDataBase(applicationContext).quoteData()
        val repository = QuoteRepository(dao)
        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(mainViewModel::class.java)



        mainViewModel.getQuotes().observe(this) {
            binding.quote = it.toString()
        }
        binding.btnAddQuote.setOnClickListener {

            val quote= Quotedtclss(0,"This is Testing","Tester")
            mainViewModel.insertQuote(quote)
        }
    }
}