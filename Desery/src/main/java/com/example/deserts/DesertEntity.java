package com.example.deserts;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deserts")

public class DesertEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;
    public String name;
    public Float price;
}