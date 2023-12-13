package com.chris.order.feign;

import com.chris.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "chris-product-server")
public interface IProductService {

    @GetMapping("/product/getProductById/{id}")
    Product getProductById(@PathVariable("id") Long id);

}
