package com.example.searchapi.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SearchResult {
    private List<Unit> units;

    @JsonCreator
    public SearchResult(@JsonProperty("units") List<Unit> units) {
        this.units = units;
    }

    public List<Unit> getUnits() {
        return units;
    }
}
