package com.example.deserts;


import com.sun.istack.NotNull;
import javax.persistence.*;


@Entity
@Table(name="orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull
    public String desertName;

    @NotNull
    public String name;

    public String phone;

    public String notes;

    @NotNull
    public Integer deliveryMethod;
}
