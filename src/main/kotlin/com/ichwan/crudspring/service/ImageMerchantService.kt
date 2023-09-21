package com.ichwan.crudspring.service

import com.ichwan.crudspring.model.ImageMerchant
import com.ichwan.crudspring.model.response.ImageResponse
import com.ichwan.crudspring.repository.ImageMerchantRepository
import com.ichwan.crudspring.service.datasource.ImageMerchantDataSource
import com.ichwan.crudspring.util.ImageUtil
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.util.Optional

@Service
class ImageMerchantService (private val imageMerchantRepository: ImageMerchantRepository) : ImageMerchantDataSource {
    override fun upload(file: MultipartFile) : ImageResponse {
        val imageData = ImageMerchant()

        imageData.imageName = file.originalFilename
        imageData.imageType = file.contentType
        imageData.imageOutlet = ImageUtil.compressImage(file.bytes)

        imageMerchantRepository.save(imageData)

        return ImageResponse(
            name = file.originalFilename,
            message = "Image successfully uploaded"
        )
    }

    override fun download(fileName: String): ByteArray {

        val imagerepo: Optional<ImageMerchant> = imageMerchantRepository.findByImageName(fileName)

        return ImageUtil.decompressImage(imagerepo.get().imageOutlet)
    }

}