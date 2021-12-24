package com.technopc.Repositories;

import com.technopc.Entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product,String> {

}
