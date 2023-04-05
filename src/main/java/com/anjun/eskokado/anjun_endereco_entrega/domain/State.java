package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "state",fetch = FetchType.LAZY)
    private List<City> cities = new ArrayList<>();
}
