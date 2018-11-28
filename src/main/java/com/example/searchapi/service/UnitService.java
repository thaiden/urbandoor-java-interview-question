package com.example.searchapi.service;

import com.example.searchapi.dto.Unit;

import java.util.List;

public interface UnitService {
    List<Unit> getUnits();
    Unit getUnit(Long id);
}
