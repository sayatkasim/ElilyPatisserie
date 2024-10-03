package com.sayatkasim.elilypatisserie.webApi.controllers;

import com.sayatkasim.elilypatisserie.business.abstracts.ProductService;
import com.sayatkasim.elilypatisserie.core.utilities.results.Result;
import com.sayatkasim.elilypatisserie.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Product product) {
        return this.productService.delete(product);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Product product) {
        return this.productService.update(product);
    }
}
