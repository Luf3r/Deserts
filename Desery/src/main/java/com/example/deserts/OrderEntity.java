package com.example.deserts;


import com.sun.istack.NotNull;
import javax.persistence.*;


@Entity
@Table(name="orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    String name;

    String phone;

    String notes;

    @NotNull
    Integer deliveryMethod;
}
