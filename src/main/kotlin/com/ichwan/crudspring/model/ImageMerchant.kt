package com.ichwan.crudspring.model

import javax.persistence.*

@Entity
@Table(name = "image_merchant")
class ImageMerchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0

    @Lob
    @Column(name = "image")
    lateinit var image_outlet: ByteArray

    @Column(name = "name")
    var image_name: String? = null

    @Column(name = "type")
    var image_type: String? = null
}