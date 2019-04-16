package cn.enjoy.service;

import cn.enjoy.vo.Product;


import java.util.List;

public interface ProductService {
    Product findById(Long id);

    List<Product> findAll();

    int create(Product product);
}
