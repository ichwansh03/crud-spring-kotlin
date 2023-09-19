package com.ichwan.crudspring.model.response

data class HeaderResponse<T> (

    val code: Int,
    val message: String,
    val data: T
)