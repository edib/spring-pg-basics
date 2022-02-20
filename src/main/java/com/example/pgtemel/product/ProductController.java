package com.example.pgtemel.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/products")
  public List<Product> getProducts() {
    return productRepository.findAll();
  }

  @GetMapping("/products/{id}")
  public Optional<Product> getProduct(@PathVariable("id") long id) {
    return productRepository.findById(id);
  }

  @PutMapping("/products")
  public void saveProduct(@RequestBody Product product) {
    productRepository.save(product);
  }

  @DeleteMapping("/products/{id}")
  public void deleteProduct(@PathVariable("id") long id, @RequestBody Product product) {
    productRepository.delete(product);
  }

}
