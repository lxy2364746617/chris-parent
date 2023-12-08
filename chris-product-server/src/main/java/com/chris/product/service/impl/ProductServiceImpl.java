package com.chris.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chris.entity.Product;
import com.chris.product.mapper.ProductMapper;
import com.chris.product.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    public Product getProductById(Long id) {
        return baseMapper.selectById(id);
    }

}
