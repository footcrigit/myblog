package com.example.myblog.homepage

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Slf4j
@Service
class ContentDetailService {

    @Autowired
    ContentDetailsRepository contentDetailsRepository

    ContentDetailsView addContentDetails(CreateContentDetailsView createContentDetailsView)
    {
        ContentDetails contentDetails = new ContentDetails(
                contentId: new ContentId( value: UUID.randomUUID()),
                contentClass: createContentDetailsView.contentClass,
                contentType: createContentDetailsView.contentType,
                resourceGroupId: createContentDetailsView.resourceGroupId
        )

        contentDetailsRepository.save(contentDetails)
    }

    ContentDetailsView getContentDetails (ContentId contentId){
        ContentDetails contentDetails = contentDetailsRepository.findById(contentId)
        ContentDetailsView contentDetailsView
        contentDetailsView.createFrom(contentDetails)
        contentDetailsView
    }


}
