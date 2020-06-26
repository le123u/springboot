package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProductCategory {
    @Id
    //类别id
    private String categoryId;
    //类别姓名
    private String categoryName;
    //种类
    private String categoryType;
    // 下单时间
    private String createTime;
    // 发货时间
    private String updateTime;
}
