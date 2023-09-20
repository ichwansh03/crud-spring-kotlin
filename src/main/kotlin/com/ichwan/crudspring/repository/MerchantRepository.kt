package com.ichwan.crudspring.repository

import com.ichwan.crudspring.model.Merchant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MerchantRepository : JpaRepository<Merchant, Int>