package com.chris.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_shop_product")
public class Product implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("p_name")
    private String pName;

    @TableField("p_price")
    private Double pPrice;

    @TableField("p_stock")
    private Integer pStock;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("del_flag")
    private Integer delFlag;

}
