package com.ff14.chousei.domain.model

import javax.persistence.Entity
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import java.util.Date
import javax.persistence.OneToMany;
import javax.persistence.Table

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

/*
 * UserテーブルのEntity.
 * @param id 主キー
 * @param title 書籍名
 * @param subTitle 書籍の副題 ない場合はnull
 * @param leadingSentence リード文
 * @param url リンク先URLパス
 */
@Entity
@Table(name = "user")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    @Column(nullable = false) var name: String = "",
    @Column(nullable = false) var pass: String = "",
    @OneToMany(mappedBy = "user")
    @Column val charcters: List<Character>? = null,
    @Column(nullable = false, updatable = false) val createTime: Date? = null,
    @Column(nullable = false) val imagePath: String = "",
    @Column(nullable = false) val twitterId: String = ""
) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority>? {
        return null
    }
    
    override fun getUsername(): String? {
        return this.name
    }

    override fun getPassword(): String? {
        return this.pass
    }

    override fun isAccountNonExpired(): Boolean
    {
        return true
    }

    override fun isAccountNonLocked(): Boolean
    {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean
    {
        return true
    }

    override fun isEnabled(): Boolean
    {
        return true
    }
}