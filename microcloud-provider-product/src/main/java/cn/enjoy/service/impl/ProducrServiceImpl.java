package cn.enjoy.service.impl;

import cn.enjoy.dao.ProductMapper;
import cn.enjoy.service.ProductService;
import cn.enjoy.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProducrServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public int create(Product product) {
        return productMapper.create(product);
    }
}
