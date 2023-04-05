package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class OrderItem {
    @EmbeddedId
    private OrderItemPk id = new OrderItemPk();

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal dicount;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

    public OrderItem(Order order, Product product, BigDecimal dicount, Integer quantity, BigDecimal price) {
        super();
        id.setOrder(order);
        id.setProduct(product);
        this.dicount = dicount;
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public Product getProduct() {
        return id.getProduct();
    }
}
