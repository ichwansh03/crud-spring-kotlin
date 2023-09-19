package com.ichwan.crudspring.model.response

data class MerchantResponse(
    val id: Int,
    var typeBranch: String,
    var address: String,
    var latitude: String,
    var longitude: String,
    var admin: String
)
