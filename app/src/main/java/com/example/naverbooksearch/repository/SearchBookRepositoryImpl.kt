package com.example.naverbooksearch.repository

import com.example.naverbooksearch.constants.NaverConstants
import com.example.naverbooksearch.model.Meta
import com.example.naverbooksearch.util.RetrofitInstance
import retrofit2.Call
import retrofit2.Response

class SearchBookRepositoryImpl : SearchBookRepository {
    override suspend fun searchBooks(
        id: String,
        secretKey: String,
        query: String,
        display: Int,
        start: Int,
        sort: String
    ): Response<Meta> {
        return RetrofitInstance.api.searchBooks(id, secretKey, query, display, start, sort)
    }

}
