package cn.enjoy.dao;

import cn.enjoy.vo.Product;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ProductMapper {
    Product findById(@Param("findById")Long id);

    List<Product> findAll();

    int create(Product product);
}
