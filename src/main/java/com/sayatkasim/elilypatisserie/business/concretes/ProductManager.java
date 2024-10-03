package com.sayatkasim.elilypatisserie.business.concretes;

import com.sayatkasim.elilypatisserie.business.abstracts.ProductService;
import com.sayatkasim.elilypatisserie.core.utilities.results.Result;
import com.sayatkasim.elilypatisserie.core.utilities.results.SuccessResult;
import com.sayatkasim.elilypatisserie.dataAccess.abstracts.ProductDao;
import com.sayatkasim.elilypatisserie.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product added");
    }

    @Override
    public Result update(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product updated");
    }

    @Override
    public Result delete(Product product) {
        this.productDao.delete(product);
        return new SuccessResult("Product deleted");
    }
}
