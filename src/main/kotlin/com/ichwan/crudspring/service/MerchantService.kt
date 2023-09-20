package com.ichwan.crudspring.service

import com.ichwan.crudspring.model.Merchant
import com.ichwan.crudspring.model.request.ListMerchantRequest
import com.ichwan.crudspring.model.response.MerchantResponse
import com.ichwan.crudspring.repository.MerchantRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.repository.findByIdOrNull
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

    override fun getMerchant(id: Int): MerchantResponse {
        return returnMerchantResponse(findMerchantByIdOrNull(id))
    }

    override fun getAllMerchant(listMerchantRequest: ListMerchantRequest): List<MerchantResponse> {
        val page = merchantRepository.findAll(PageRequest.of(listMerchantRequest.page, listMerchantRequest.size, Sort.unsorted()))

        val list: List<Merchant> = page.content

        return list.map { returnMerchantResponse(it) }
    }

    override fun updateMerchant(id: Int, merchant: Merchant): MerchantResponse {
        val update = findMerchantByIdOrNull(id)

        update.apply {
            typeBranch = merchant.typeBranch
            address = merchant.address
            latitude = merchant.latitude
            longitude = merchant.longitude
            admin = merchant.admin
        }

        merchantRepository.save(update)

        return returnMerchantResponse(update)
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

    private fun findMerchantByIdOrNull(id: Int): Merchant{
        val merchant = merchantRepository.findByIdOrNull(id)

        if (merchant != null) return merchant
        else throw NotFoundException()
    }
}