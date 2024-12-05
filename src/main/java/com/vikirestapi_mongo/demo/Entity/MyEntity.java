package com.vikirestapi_mongo.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Std") // Define the collection name in MongoDB
public class MyEntity {
    @Id
    private String id; // MongoDB automatically generates an ID for each document
    private String name; // Example field, you can add more fields if needed

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
