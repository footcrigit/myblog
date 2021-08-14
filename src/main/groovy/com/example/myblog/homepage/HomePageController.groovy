package com.example.myblog.homepage

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HomePageController {

    @RequestMapping(value = "/v1/homepage/{primaryNum}/{secondaryNum}", method = RequestMethod.GET)
    long CalculateNumber(@PathVariable("primaryNum") long primaryNum, @PathVariable("secondaryNum") long secondaryNum)
    {
        return primaryNum + secondaryNum
    }
}
