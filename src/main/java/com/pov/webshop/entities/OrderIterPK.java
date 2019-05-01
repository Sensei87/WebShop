package com.pov.webshop.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrderIterPK implements Serializable {
    private int orderId;
    private int goodsId;
    private int id;

    @Column(name = "order_id")
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Column(name = "goods_id")
    @Id
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderIterPK that = (OrderIterPK) o;
        return orderId == that.orderId &&
                goodsId == that.goodsId &&
                id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, goodsId, id);
    }
}
