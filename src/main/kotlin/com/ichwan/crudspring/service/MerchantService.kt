package com.ichwan.crudspring.service

import com.ichwan.crudspring.model.Merchant
import com.ichwan.crudspring.model.response.MerchantResponse
import com.ichwan.crudspring.repository.MerchantRepository
import org.springframework.stereotype.Service

@Service
class MerchantService(private val merchantRepository: MerchantRepository) : MerchantContract {

    override fun insertMerchant(merchant: Merchant): MerchantResponse {
        val data = Merchant(
            id = merchant.id,
            typeBranch = merchant.typeBranch,
            address = merchant.address,
            latitude = merchant.latitude,
            longitude = merchant.longitude,
            admin = merchant.admin
        )

        merchantRepository.save(data)

        return returnMerchantResponse(data)
    }

    private fun returnMerchantResponse(merchant: Merchant) : MerchantResponse {
        return MerchantResponse(
            merchant.id,
            merchant.typeBranch,
            merchant.address,
            merchant.latitude,
            merchant.longitude,
            merchant.admin
        )
    }
}