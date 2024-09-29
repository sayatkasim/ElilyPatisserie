package com.sayatkasim.elilypatisserie.dataAccess.abstracts;

import com.sayatkasim.elilypatisserie.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
