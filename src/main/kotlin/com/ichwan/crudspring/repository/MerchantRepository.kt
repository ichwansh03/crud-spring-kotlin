package com.ichwan.crudspring.repository

import com.ichwan.crudspring.model.Merchant
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MerchantRepository : CrudRepository<Merchant, Int>