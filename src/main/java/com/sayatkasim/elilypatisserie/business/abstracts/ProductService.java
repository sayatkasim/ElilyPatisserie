package com.sayatkasim.elilypatisserie.business.abstracts;

import com.sayatkasim.elilypatisserie.core.utilities.results.DataResult;
import com.sayatkasim.elilypatisserie.core.utilities.results.Result;
import com.sayatkasim.elilypatisserie.entities.concretes.Product;

import javax.xml.crypto.Data;
import java.util.List;

public interface   ProductService {

    List<Product> getAll();
    Result add(Product product);
    Result update(Product product);
    Result delete(Product product);
    DataResult<Product> getById(int id);
    DataResult<List<Product>> getByName(String name);
    DataResult<List<Product>> getByDescription(String description);
    DataResult<List<Product>> getByPrice(int price);
    DataResult<List<Product>> getByPrice(int price, int min, int max);
    DataResult<List<Product>> getByFloor(int floor);

}
