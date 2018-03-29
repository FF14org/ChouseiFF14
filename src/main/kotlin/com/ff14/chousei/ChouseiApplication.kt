package com.ff14.chousei

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientAutoConfiguration
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.security.Principal
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
@RestController
open class ChouseiApplication {

    @RequestMapping("/user")
    fun user(principal: Principal): Principal {
        return principal
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ChouseiApplication::class.java, *args)
        }
    }
}
