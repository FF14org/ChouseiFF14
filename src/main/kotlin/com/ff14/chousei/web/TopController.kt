package com.ff14.chousei.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class TopController
{
    open val PAGE: String = "/"
    private val HTML: String = "top"

    @GetMapping("/")
    public fun top(model: Model): String
    {
        return this.HTML
    }
}