package com.technopc.Repositories;

import com.technopc.Entities.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
@RepositoryRestResource
@CrossOrigin(origins = "*")

public interface ProductRepository extends MongoRepository<Product,String> {

}
