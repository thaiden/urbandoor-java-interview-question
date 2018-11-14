package com.example.searchapi.service;

import com.example.searchapi.db.dao.Property;

import java.util.List;

public interface PropertyService {
    List<Property> getProperties();
    Property getProperty(Long id);
}
