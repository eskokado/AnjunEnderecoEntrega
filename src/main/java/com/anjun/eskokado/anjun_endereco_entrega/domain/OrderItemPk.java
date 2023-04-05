package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data
public class OrderItemPk {
    @ManyToOne
    @JoinColumn()
    private Order order;
    @JoinColumn()
    @ManyToOne
    private Product product;
}
