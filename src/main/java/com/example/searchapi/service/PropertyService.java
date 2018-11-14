package com.example.searchapi.service;

import com.example.searchapi.db.dao.Property;

import java.util.List;
import java.util.UUID;

public interface PropertyService {
    List<Property> getProperties();
    Property getProperty(UUID id);
}
