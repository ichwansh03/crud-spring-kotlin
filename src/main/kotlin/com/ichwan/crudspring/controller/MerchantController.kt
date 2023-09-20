package com.ichwan.crudspring.controller

import com.ichwan.crudspring.model.Merchant
import com.ichwan.crudspring.model.response.HeaderResponse
import com.ichwan.crudspring.model.response.MerchantResponse
import com.ichwan.crudspring.service.MerchantService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/merchant")
class MerchantController(private val merchantService: MerchantService) {

    @PostMapping
    fun createMerchant(@RequestBody body: Merchant): HeaderResponse<MerchantResponse>{
        val merchantResponse = merchantService.insertMerchant(body)

        return HeaderResponse(
            code = "201 Created",
            message = "Data successfully added",
            data = merchantResponse
        )
    }
}