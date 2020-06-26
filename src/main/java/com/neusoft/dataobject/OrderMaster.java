package com.neusoft.dataobject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

// dataobject 中的类即是实体类 他是与数据库中的表字段一一对应的类
// 写成javabean模式 所有属性都是私有的 系统默认提供get set方法
// 订单的主表
// Data = Getter and Setter
@Data
// 实体类
@Entity
public class OrderMaster {
    //订单id
    @Id //主键
    private String orderId;
    // 买家姓名
    private String buyerName;
    // 买家电话
    private int buyerPhone;
    //买家id
    private String buyerOpenId;
    // 订单金额
    private BigDecimal orderAmount;
    // 订单状态
    private boolean orderStatus;
    //支付状态
    private boolean payStatus;
    // 下单时间
    private String createTime;
    // 发货时间
    private String updateTime;

}
