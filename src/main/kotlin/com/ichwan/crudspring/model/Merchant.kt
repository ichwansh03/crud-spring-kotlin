package com.ichwan.crudspring.model

import javax.persistence.*

@Entity
@Table(name = "merchant")
data class Merchant (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,

    var typeBranch: String,
    var address: String,
    var latitude: String,
    var longitude: String,
    var admin: String
)