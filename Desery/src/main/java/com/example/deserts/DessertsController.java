package com.example.deserts;

import java.util.List;
import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api
@CrossOrigin
@RestController
public class DessertsController {

    @Autowired
    DesertsRepository desertsRepository;

    @Autowired
    OrdersRepository ordersRepository;

//    @GetMapping("/api/desery")
//    public List<String> getDesserts() {
//        ArrayList<String> desserts=new ArrayList<>();
//        Collections.addAll(desserts, new String[]{"donut","ics","froyo"});
//        return desserts;
//    }

    @GetMapping("/api/desery")
    @ApiOperation(value="zwraca liste deserow", response = DesertEntity.class)
    public List<DesertEntity> getDesserts() {
//        ArrayList<DesertEntity> desserts = new ArrayList<>();
//        DesertEntity d1 = new DesertEntity();
//
//        d1.id = 0L;
//        d1.name = "Donut";
//        d1.price = 54f;
//
//        DesertEntity d2 = new DesertEntity();
//        d2.id = 4L;
//        d2.name = "Prokerka";
//        d2.price = 96f;
//
//        DesertEntity d3 = new DesertEntity();
//        d3.id = 5L;
//        d3.name = "Prok";
//        d3.price = 85.9f;
//
//        desserts.add(d1);
//        desserts.add(d2);
//        desserts.add(d3);
//
//        System.out.println("Returned the list");
//        return desserts;
        return desertsRepository.findAll();
    }

    @PostMapping("/api/zamowienie")
    @ApiOperation(value="zapisuje zamowenie", response = OrderEntity.class)
    public OrderEntity addNewOrder(@ApiParam(value="Tresc zamowienia", required = true)
                                       @Valid @RequestBody OrderEntity order){
        OrderEntity savedOrder = ordersRepository.save(order);
        return savedOrder;
    }
}