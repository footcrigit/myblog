package com.example.myblog.homepage

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class ContentId implements Serializable
{
    @Column(name = "content_id")
    UUID value
}
