package io.unreal.web3authenticator.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthenticationController {

    @GetMapping("/authenticate")
    fun authenticate(): String {
        return "Hello, World"
    }
}