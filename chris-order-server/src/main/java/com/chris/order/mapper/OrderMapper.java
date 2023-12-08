package com.chris.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
