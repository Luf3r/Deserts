package com.api.deserts.controller;

import java.util.List;
import javax.validation.Valid;

import com.api.deserts.entity.DesertEntity;
import com.api.deserts.entity.OrderEntity;
import com.api.deserts.repository.DesertsRepository;
import com.api.deserts.repository.OrdersRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api
@CrossOrigin
@RestController
public class DessertsController {
    private final DesertsRepository desertsRepository;
    private final OrdersRepository ordersRepository;

    @Autowired
    public DessertsController(DesertsRepository desertsRepository, OrdersRepository ordersRepository) {
        this.desertsRepository = desertsRepository;
        this.ordersRepository = ordersRepository;
    }


    @GetMapping("/api/desery")
    @ApiOperation(value = "zwraca liste deserow", response = DesertEntity.class)
    public List<DesertEntity> getDesserts() {
        return desertsRepository.findAll();
    }

    @PostMapping("/api/zamowienie")
    @ApiOperation(value = "zapisuje zamowenie", response = OrderEntity.class)
    public OrderEntity addNewOrder(@ApiParam(value = "Tresc zamowienia", required = true)
                                   @Valid @RequestBody OrderEntity order) {
        return ordersRepository.save(order);
    }
}