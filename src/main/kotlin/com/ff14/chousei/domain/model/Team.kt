package com.ff14.chousei.domain.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.OneToOne
import javax.persistence.OneToMany
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
@Table(name = "team")
data class Team(
    @Id @GeneratedValue var id: Long? = null,
    @Column(nullable = false) var name: String = "",
    @Column var profile: String? = "",
    @OneToOne(mappedBy = "team") @Column(nullable = false) var leaderId: Character? = null,
    @OneToMany(mappedBy = "team") @Column(nullable = false) var character: List<Character>? = null) {
}