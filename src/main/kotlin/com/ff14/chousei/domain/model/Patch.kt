package com.ff14.chousei.domain.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
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
@Table(name = "patch")
data class Patch(
    @Id @GeneratedValue var id: Long? = null,
    @Column(nullable = false) var name: String = "",
    @OneToMany(mappedBy = "user")
    @Column var raid: List<Raid>? = null,
    @Column(nullable = false) var startDate: String = "",
    @Column(nullable = false) var endDate: String = "") {
}