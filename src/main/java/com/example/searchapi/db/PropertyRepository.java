package com.example.searchapi.db;

import com.example.searchapi.db.dao.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PropertyRepository extends CrudRepository<Property, UUID> {
}
