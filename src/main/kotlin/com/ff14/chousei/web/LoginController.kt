package com.ff14.chousei.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class LoginController
{

    @RequestMapping("/login")
    fun top(model: Model): String
    {
        return "login"
    }
}