package com.ichwan.crudspring.service

import com.ichwan.crudspring.model.Merchant
import com.ichwan.crudspring.model.response.MerchantResponse

interface MerchantContract {

    fun insertMerchant(merchant: Merchant) : MerchantResponse
}