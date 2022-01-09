package com.technopc.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;


@Document

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
@Id
private String id;
    private String name;
    private double price;


    private Category category;


}
