package com.example.searchapi.controller;

import com.example.searchapi.dto.SearchResult;
import com.example.searchapi.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchContoller {

    @Autowired
    UnitService unitService;

    @GetMapping("/search")
    public SearchResult search() {

        return new SearchResult(unitService.getUnits());
    }
}

