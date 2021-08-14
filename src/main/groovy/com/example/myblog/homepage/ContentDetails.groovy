package com.example.myblog.homepage

import groovy.transform.EqualsAndHashCode

import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@EqualsAndHashCode
@Entity
@Table(name = "content_details")
class ContentDetails implements Serializable
{
    @EmbeddedId
    ContentId contentId

    @Column(name = "content_type")
    String contentType

    @Column(name = "content_class")
    String contentClass

    @Column(name = "r_group_id")
    String resourceGroupId
}
