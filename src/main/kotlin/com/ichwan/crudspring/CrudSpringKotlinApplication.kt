package com.ichwan.crudspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudSpringKotlinApplication

fun main(args: Array<String>) {
	runApplication<CrudSpringKotlinApplication>(*args)
}
