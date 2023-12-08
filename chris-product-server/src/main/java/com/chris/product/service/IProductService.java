package com.chris.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chris.entity.Product;

public interface IProductService extends IService<Product> {

    Product getProductById(Long id);

}
