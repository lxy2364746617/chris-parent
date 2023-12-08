package com.chris.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
