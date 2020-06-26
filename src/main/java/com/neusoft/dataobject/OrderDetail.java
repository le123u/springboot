package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class OrderDetail {

    @Id
    //
    private String detailId;
    //订单id
    private String orderId;
    //生产id
    private String productId;
    //生产姓名
    private  String productName;
    //生产价格
    private int productPrice;
    //生产质量
    private String productQuantity;
    // 生产图标
    private String productIcon;
    // 下单时间
    private String createTime;
    // 发货时间
    private String updateTime;


}
