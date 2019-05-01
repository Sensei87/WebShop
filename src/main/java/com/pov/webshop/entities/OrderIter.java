package com.pov.webshop.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_iter", schema = "public", catalog = "WebShop")
@IdClass(OrderIterPK.class)
public class OrderIter {
    private int orderId;
    private int goodsId;
    private int id;
    private Integer orderedQuantity;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Id
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ordered_quantity")
    public Integer getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(Integer orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderIter orderIter = (OrderIter) o;
        return orderId == orderIter.orderId &&
                goodsId == orderIter.goodsId &&
                id == orderIter.id &&
                Objects.equals(orderedQuantity, orderIter.orderedQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, goodsId, id, orderedQuantity);
    }
}
