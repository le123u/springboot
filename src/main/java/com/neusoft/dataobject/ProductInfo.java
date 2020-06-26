package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ProductInfo {
    @Id
    //产品id
    private String productId;
    //产品姓名
    private  String productName;
    //产品价格
    private int productPrice;
    //产品库存
    private String productStock;
    //产品描述
    private String productDescription;
    //产品图标
    private String productIcon;
    //产品状态
    private String productStatus;
    //类别
    private String categoryType;
    // 下单时间
    private String createTime;
    // 发货时间
    private String updateTime;

}
