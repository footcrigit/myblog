package com.example.myblog.homepage

import com.fasterxml.jackson.annotation.JsonView

class ContentDetailsView {
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

    ContentDetailsView createFrom(ContentDetails contentDetails)
    {
        return new ContentDetailsView(
                contentId: contentDetails.contentId.value.toString(),
                contentType: contentDetails.contentType,
                contentClass: contentDetails.contentClass,
                resourceGroupId: contentDetails.resourceGroupId
        )
    }
}
