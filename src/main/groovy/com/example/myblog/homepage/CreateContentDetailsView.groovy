package com.example.myblog.homepage

import com.fasterxml.jackson.annotation.JsonView
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class CreateContentDetailsView {

    @JsonView([Views.V1])
    String contentId

    @JsonView([Views.V1])
    String contentType

    @JsonView([Views.V1])
    String contentClass

    @JsonView([Views.V1])
    String resourceGroupId

    class Views
    {
        static class V1 { }
    }
}
