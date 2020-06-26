package com.neusoft.sell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/index")
    public String index(){
        return "Hello SpringBoot";
    }
}
