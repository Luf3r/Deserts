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
    
    @GetMapping("/api/desery")
    public List<String> getDesserts() {
        ArrayList<String> desserts=new ArrayList<>();
        Collections.addAll(desserts, new String[]{"donut","ics","froyo"});
        return desserts;
    }
    
}
