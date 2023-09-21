package com.ichwan.crudspring.repository

import com.ichwan.crudspring.model.ImageMerchant
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ImageMerchantRepository : CrudRepository<ImageMerchant, Int>