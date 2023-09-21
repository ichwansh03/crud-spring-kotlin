package com.ichwan.crudspring.service.datasource

import org.springframework.web.multipart.MultipartFile

interface ImageMerchantDataSource {

    fun upload(file: MultipartFile)
}