package com.sayatkasim.elilypatisserie.dataAccess.abstracts;

import com.sayatkasim.elilypatisserie.core.utilities.results.DataResult;
import com.sayatkasim.elilypatisserie.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<Product> getByName(String name);
    List<Product> getByDescription(String description);
    List<Product> getByPrice(int price);
    List<Product> getByPrice(int price, int min, int max);
    List<Product> getByFloor(int floor);

}
