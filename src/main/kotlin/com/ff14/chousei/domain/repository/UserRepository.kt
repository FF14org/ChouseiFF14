package com.ff14.chousei.repository

import com.ff14.chousei.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * bookテーブルのRepository.
 */
@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByUsername(username: String): User
}
