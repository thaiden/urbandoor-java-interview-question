package com.example.searchapi.controller;

import com.example.searchapi.dto.SearchRequest;
import com.example.searchapi.dto.SearchResult;
import com.example.searchapi.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SearchContoller {

    @Autowired
    PropertyService propertyService;

    @PostMapping("/search")
    public SearchResult search(@RequestBody SearchRequest requestBody) {

        return null;
    }
}

