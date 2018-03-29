package com.ff14.chousei.service

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ff14.chousei.domain.model.User
import com.ff14.chousei.repository.UserRepository

@Service
class UserService(val userRepository: UserRepository) : UserDetailsService
{

    @Throws(Exception::class)
    override fun loadUserByUsername(username: String): UserDetails
    {
        if (StringUtils.isEmpty(username))
        {
            throw UsernameNotFoundException("")
        }

        val user: User = userRepository.findByUsername(username)
        if (user == null)
        {
            throw UsernameNotFoundException("")
        }

        return user;
    }

}