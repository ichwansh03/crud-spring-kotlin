package com.ichwan.crudspring.service.datasource

import com.ichwan.crudspring.model.response.ImageResponse
import org.springframework.web.multipart.MultipartFile

interface ImageMerchantDataSource {

    fun upload(file: MultipartFile) : ImageResponse

    fun download(fileName: String): ByteArray
}