package com.sayatkasim.elilypatisserie.business.abstracts;

import com.sayatkasim.elilypatisserie.core.utilities.results.Result;
import com.sayatkasim.elilypatisserie.entities.concretes.Product;

import java.util.List;

public interface   ProductService {

    List<Product> getAll();
    Result add(Product product);
    Result update(Product product);
    Result delete(Product product);

}
