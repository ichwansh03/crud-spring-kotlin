package com.ichwan.crudspring.test

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MockMerchantDataSourceTest{

    private val mockDataSource = MockMerchantDataSource()

    @Test
    fun `should provide a collection of merchant`(){

        //when
        val merchant = mockDataSource.retrieveMerchants()

        //then
        Assertions.assertThat(merchant).allMatch { it.typeBranch.isNotBlank() }
        Assertions.assertThat(merchant).anyMatch { it.address.isNotBlank() }
        Assertions.assertThat(merchant).anyMatch { it.admin.isNotBlank() }
    }
}