package com.ichwan.crudspring.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ControllerTest {

    @GetMapping("hello")
    fun hello(): String = "Hello world!"
}