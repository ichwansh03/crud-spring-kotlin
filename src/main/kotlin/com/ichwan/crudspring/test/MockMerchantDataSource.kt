package com.ichwan.crudspring.test

import com.ichwan.crudspring.model.Merchant
import org.springframework.stereotype.Repository

@Repository
class MockMerchantDataSource : MerchantDataSource {

    val merchants = listOf(
        Merchant(1,"Center","Lampung","0.00","0.110","Siska"),
        Merchant(2,"","Lampung","0.00","0.110","Siska")
    )

    override fun retrieveMerchants(): Collection<Merchant> = merchants
}