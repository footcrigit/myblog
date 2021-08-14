package com.example.myblog.homepage

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class ContentId {
    @Column(name = "content_id")
    UUID value
}
