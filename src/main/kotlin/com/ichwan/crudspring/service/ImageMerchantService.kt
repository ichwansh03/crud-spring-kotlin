package com.ichwan.crudspring.service

import com.ichwan.crudspring.model.ImageMerchant
import com.ichwan.crudspring.repository.ImageMerchantRepository
import com.ichwan.crudspring.service.datasource.ImageMerchantDataSource
import com.ichwan.crudspring.util.ImageUtil
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ImageMerchantService (private val imageMerchantRepository: ImageMerchantRepository) : ImageMerchantDataSource {
    override fun upload(file: MultipartFile) {
        val imageData = ImageMerchant()

        imageData.image_name = file.originalFilename
        imageData.image_type = file.contentType
        imageData.image_outlet = ImageUtil.compressImage(file.bytes)

        imageMerchantRepository.save(imageData)
    }


}