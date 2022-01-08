package com.technopc;

import com.technopc.Entities.Category;
import com.technopc.Entities.Product;
import com.technopc.Repositories.CategoryRepository;
import com.technopc.Repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
)
public class TechnopcApplication {


    public static void main(String[] args) {
        SpringApplication.run(TechnopcApplication.class, args);
    }


 @Bean
 CommandLineRunner start(CategoryRepository categoryRepository,
                         ProductRepository productRepository,
                         RepositoryRestConfiguration repositoryRestConfiguration) {
      return args -> {
    repositoryRestConfiguration.exposeIdsFor(Product.class);
    repositoryRestConfiguration.exposeIdsFor(Category.class);
        };
    }
}
