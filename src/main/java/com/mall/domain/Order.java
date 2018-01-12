package com.mall.domain;

import java.util.Date;

public class Order {
    private String id;
    private Date createDate;

    public Order(String id, Date createDate) {
        this.id = id;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
