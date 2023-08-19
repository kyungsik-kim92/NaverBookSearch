package com.example.naverbooksearch.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.naverbooksearch.R
import com.example.naverbooksearch.databinding.ActivityMainBinding
import com.example.naverbooksearch.repository.SearchBookRepositoryImpl
import com.example.naverbooksearch.viewmodel.BookSearchViewModelProviderFactory
import com.example.naverbooksearch.viewmodel.SearchBookViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var searchBookViewModel: SearchBookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val searchBookRepository = SearchBookRepositoryImpl()

        val factory = BookSearchViewModelProviderFactory(searchBookRepository)
        searchBookViewModel = ViewModelProvider(this, factory)[SearchBookViewModel::class.java]
    }






}