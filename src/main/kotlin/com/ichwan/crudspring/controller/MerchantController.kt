package com.ichwan.crudspring.controller

import com.ichwan.crudspring.model.ImageMerchant
import com.ichwan.crudspring.model.Merchant
import com.ichwan.crudspring.model.request.ListMerchantRequest
import com.ichwan.crudspring.model.response.HeaderResponse
import com.ichwan.crudspring.model.response.ImageResponse
import com.ichwan.crudspring.model.response.MerchantResponse
import com.ichwan.crudspring.service.ImageMerchantService
import com.ichwan.crudspring.service.MerchantService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/merchant")
class MerchantController(
    private val merchantService: MerchantService,
    private val imageMerchantService: ImageMerchantService) {

    @PostMapping
    fun createMerchant(@RequestBody merchant: Merchant, @RequestPart(value = "file") file: MultipartFile): HeaderResponse<MerchantResponse>{

        return HeaderResponse(
            code = "201 Created",
            message = "Data successfully added",
            data = merchantService.insertMerchant(merchant, file)
        )
    }

    @GetMapping("{id}")
    fun getMerchantById(@PathVariable("id") id: Int): HeaderResponse<MerchantResponse>{

        return HeaderResponse(
            code = "200 OK",
            message = "Data merchant successfully get",
            data = merchantService.getMerchant(id)
        )
    }

    @GetMapping
    fun getMerchants(@RequestParam(value = "size") size: Int,
                     @RequestParam(value = "page") page: Int) : HeaderResponse<List<MerchantResponse>>{
        val request = ListMerchantRequest(page, size)

        return HeaderResponse(
            code = "200 OK",
            message = "All data merchant successfully get",
            data = merchantService.getAllMerchant(request)
        )
    }

    @PutMapping("{id}")
    fun updateMerchant(@PathVariable("id") id: Int,
                       @RequestBody merchant: Merchant) : HeaderResponse<MerchantResponse>{

        return HeaderResponse(
            code = "200 OK",
            message = "Data merchant successfully updated",
            data = merchantService.updateMerchant(id, merchant)
        )
    }

    @DeleteMapping("{id}")
    fun deleteMerchant(@PathVariable("id") id: Int) : HeaderResponse<Int>{

        merchantService.deleteMerchant(id)

        return HeaderResponse(
            code = "200 OK",
            message = "Data merchant successfully deleted",
            data = id
        )
    }

    @PostMapping("upload")
    fun uploadImage(@RequestParam("image_outlet") file: MultipartFile) : HeaderResponse<ImageResponse>{
        imageMerchantService.upload(file)

        return HeaderResponse(
            code = "200 OK",
            message = "Image uploaded",
            data = ImageResponse(0,"name","png")
        )
    }
}