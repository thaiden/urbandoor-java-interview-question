package com.example.searchapi.service.impl;

import com.example.searchapi.db.PropertyRepository;
import com.example.searchapi.dto.Unit;
import com.example.searchapi.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {
    @Autowired
    private PropertyRepository repository;

    @Override
    public List<Unit> getUnits() {
        // TODO: impl
        return Arrays.asList(new Unit("test-1"), new Unit("test-2"));
    }

    @Override
    public Unit getUnit(Long id) {
        // TODO: impl
        return new Unit("test-1");
    }
}
