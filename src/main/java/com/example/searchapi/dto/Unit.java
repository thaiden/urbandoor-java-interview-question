package com.example.searchapi.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Unit {
    private String name;

    @JsonCreator
    public Unit(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
