package com.api.deserts.entity;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String desertName;

    @NotNull
    private String name;

    private String phone;

    private String notes;

    @NotNull
    private Integer deliveryMethod;
}
