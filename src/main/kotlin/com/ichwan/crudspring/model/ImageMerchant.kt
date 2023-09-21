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
    lateinit var imageOutlet: ByteArray

    @Column(name = "name")
    var imageName: String? = null

    @Column(name = "type")
    var imageType: String? = null
}