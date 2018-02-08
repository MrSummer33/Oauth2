package com.xiaxi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BaoCai on 18/2/5.
 * Description:
 */
@RestController
public class HelloController {

    @GetMapping("permitAll")
    public String permitAll(){
        return "permitAll";
    }

    @GetMapping("user")
    public String user(){
        return "user";
    }

}
