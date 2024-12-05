package com.vikirestapi_mongo.demo.Service;

import com.vikirestapi_mongo.demo.Entity.MyEntity;
import com.vikirestapi_mongo.demo.Repo.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEntityService {
    private final MyEntityRepository repository;

    @Autowired
    public MyEntityService(MyEntityRepository repository) {
        this.repository = repository;
    }

    // Save entity to MongoDB
    public MyEntity saveEntity(MyEntity entity) {
        return repository.save(entity); // Saves the entity in the MongoDB collection
    }

    // Get all entities from MongoDB
    public List<MyEntity> getAllEntities() {
        return repository.findAll(); // Retrieves all documents from the MongoDB collection
    }
}
