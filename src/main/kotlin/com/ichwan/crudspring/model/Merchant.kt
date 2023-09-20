package com.ichwan.crudspring.model

import javax.persistence.*

@Entity
@Table(name = "merchant")
data class Merchant (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,

    @Column(name = "type_branch")
    var typeBranch: String,

    @Column(name = "address")
    var address: String,

    @Column(name = "latitude")
    var latitude: String,

    @Column(name = "longitude")
    var longitude: String,

    @Column(name = "admin")
    var admin: String
)