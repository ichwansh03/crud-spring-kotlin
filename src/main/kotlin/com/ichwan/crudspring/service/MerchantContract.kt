package com.ichwan.crudspring.service

import com.ichwan.crudspring.model.Merchant
import com.ichwan.crudspring.model.request.ListMerchantRequest
import com.ichwan.crudspring.model.response.MerchantResponse

interface MerchantContract {

    fun insertMerchant(merchant: Merchant) : MerchantResponse

    fun getMerchant(id: Int) : MerchantResponse

    fun getAllMerchant(listMerchantRequest: ListMerchantRequest) : List<MerchantResponse>

    fun updateMerchant(id: Int, merchant: Merchant) : MerchantResponse

    fun deleteMerchant(id: Int)
}