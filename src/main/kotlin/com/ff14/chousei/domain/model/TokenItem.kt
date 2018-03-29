package com.ff14.chousei.domain.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

/*
 * UserテーブルのEntity.
 * @param id 主キー
 * @param title 書籍名
 * @param subTitle 書籍の副題 ない場合はnull
 * @param leadingSentence リード文
 * @param url リンク先URLパス
 */
@Entity
@Table(name = "tokenitem")
data class TokenItem(
    @Id @GeneratedValue var id: Long? = null,
    @Column(nullable = false) var name: String = "",
    @Column var job: String? = null,
    @Column var role: String? = null,
    @Column var parts: String? = null,
    @Column var itemLevel: String? = null,
    @Column var loadstoneUrl: String? = null,
    @Column var imageUrl: String? = null,
    @Column(nullable = false) var tokenNum: Int = 0,
    @Column(nullable = false) var number: String = "") {
}