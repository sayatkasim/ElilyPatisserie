package com.sayatkasim.elilypatisserie.business.abstracts;

import com.sayatkasim.elilypatisserie.entities.concretes.Product;

import java.util.List;

public interface   ProductService {
    List<Product> getAll();
}
