package com.ff14.chousei.domain.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.OneToMany
import javax.persistence.ManyToMany
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
@Table(name = "raid")
data class Raid(
    @Id @GeneratedValue var id: Long? = null,
    @Column(nullable = false) var name: String = "",
    @Column var raiditem: List<RaidItem>? = null,
    @ManyToMany @Column(nullable = false) var patch: List<Patch>? = null,
    @Column(nullable = false) var number: String = "") {
}