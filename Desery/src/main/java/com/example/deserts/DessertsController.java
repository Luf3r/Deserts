package com.example.deserts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DessertsController {
    
//    @GetMapping("/api/desery")
//    public List<String> getDesserts() {
//        ArrayList<String> desserts=new ArrayList<>();
//        Collections.addAll(desserts, new String[]{"donut","ics","froyo"});
//        return desserts;
//    }

    @GetMapping("/api/desery")
    public List<DesertEntity> getDesserts() {
        ArrayList<DesertEntity> desserts=new ArrayList<>();
        DesertEntity d1 = new DesertEntity();

        d1.id = 0L;
        d1.name = "Donut";
        d1.price = 54f;

        DesertEntity d2 = new DesertEntity();
        d2.id = 4L;
        d2.name = "Prokerka";
        d2.price = 96f;

        DesertEntity d3 = new DesertEntity();
        d3.id = 5L;
        d3.name = "Prok";
        d3.price = 85.9f;

        desserts.add(d1);
        desserts.add(d2);
        desserts.add(d3);

        System.out.println("Returned the list");
        return desserts;
    }
}