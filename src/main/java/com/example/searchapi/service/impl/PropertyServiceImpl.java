package com.example.searchapi.service.impl;

import com.example.searchapi.db.PropertyRepository;
import com.example.searchapi.db.dao.Property;
import com.example.searchapi.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository repository;

    @Override
    public List<Property> getProperties() {
        // TODO: impl
        return Collections.emptyList();
    }

    @Override
    public Property getProperty(Long id) {
        // TODO: impl
        return null;
    }
}
