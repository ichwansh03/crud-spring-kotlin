package com.ichwan.crudspring.model.response

data class HeaderResponse<T> (

    val code: String,
    val message: String,
    val data: T
)