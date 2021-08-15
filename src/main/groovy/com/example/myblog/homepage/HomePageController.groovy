package com.example.myblog.homepage

import com.fasterxml.jackson.annotation.JsonView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HomePageController {

    @Autowired
    ContentDetailService contentDetailService

//    @RequestMapping(value = "/v1/homepage/{primaryNum}/{secondaryNum}", method = RequestMethod.GET)
//    long CalculateNumber(@PathVariable("primaryNum") long primaryNum, @PathVariable("secondaryNum") long secondaryNum)
//    {
//        return primaryNum + secondaryNum
//    }

    @RequestMapping(value = "v1/addcontent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @JsonView([CreateContentDetailsView.Views.V1])
    ResponseEntity <ContentDetailsView> addContent(CreateContentDetailsView contentDetailsView)
    {
        ContentDetailsView contentDetailsView1 = contentDetailService.addContentDetails(contentDetailsView)
        ResponseEntity.ok(contentDetailsView1)
    }
}
