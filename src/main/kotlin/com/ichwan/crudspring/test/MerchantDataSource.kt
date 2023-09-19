package com.ichwan.crudspring.test

import com.ichwan.crudspring.model.Merchant

interface MerchantDataSource {

    fun retrieveMerchants(): Collection<Merchant>
}