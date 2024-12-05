package com.vikirestapi_mongo.demo.Controller;

import com.vikirestapi_mongo.demo.Entity.MyEntity;
import com.vikirestapi_mongo.demo.Service.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v/r")
public class MyEntityController {
    private final MyEntityService service;

    @Autowired
    public MyEntityController(MyEntityService service) {
        this.service = service;
    }

    // POST method to save a new entity to MongoDB
    @PostMapping("/r")
    public MyEntity createEntity(@RequestBody MyEntity entity) {
        return service.saveEntity(entity);
    }

    // GET method to retrieve all entities from MongoDB
    @GetMapping("/rr")
    public List<MyEntity> getAllEntities() {
        return service.getAllEntities();

    }


}
