package com.sensoric.enose.entity.base

import com.sensoric.enose.entity.User
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseAuditEntity<T> : BaseEntity<T>() {

    @CreatedBy
    @Column(name="created_by",updatable = false, nullable = false)
    lateinit var createdBy: String

    @LastModifiedBy
    @Column(name="modified_by", updatable = false, nullable = false)
    lateinit var modifiedBy: String

    @CreatedDate
    @Column(name="created_date" ,updatable = false, nullable = false)
    lateinit var createdDate: LocalDateTime

    @LastModifiedDate
    @Column(name="last_modified_date", updatable = false, nullable = false)
    lateinit var lastModifiedDate: LocalDateTime
}