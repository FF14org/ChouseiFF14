package com.ff14.chousei.domain.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.ManyToOne
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
@Table(name = "character")
data class Character(
    @Id @GeneratedValue var id: Long? = null,
    @Column(nullable = false) var name: String = "",
    @Column var sex: String? = null,
    @Column var clan: String? = null,
    @Column var firstjob: String? = null,
    @Column var secondJob: String? = null,
    @Column var thirdJob: String? = null,
    @Column var thisWeekToken: Int? = 0,
    @Column var spendToken: Int? = 0,
    @Column var allToken: Int = 0,
    @Column var getTokenItems: String? = null,
    @Column var getRaidItems: String? = null,
    @Column(nullable = false) var imagePath: String = "",
    @Column(nullable = false) var url: String = "",
    @ManyToOne @Column var user: User? = null,
    @ManyToOne @Column var team: Team? = null,
    @Column var isLeader: Boolean) {
}