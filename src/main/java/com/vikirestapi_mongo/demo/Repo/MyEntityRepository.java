package com.vikirestapi_mongo.demo.Repo;

import com.vikirestapi_mongo.demo.Entity.MyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyEntityRepository extends MongoRepository<MyEntity, String> {
    // You can define custom query methods here if needed
}
