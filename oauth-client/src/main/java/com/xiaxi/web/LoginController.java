package com.xiaxi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by BaoCai on 18/2/5.
 * Description:
 */
@RestController
public class LoginController {

    @Autowired
    private OAuth2RestOperations oauth2RestTemplate;

    @GetMapping("hello")
    public String hello(){
        return "hello client !" ;
    }

    @GetMapping("/client/login")
    public OAuth2AccessToken login(@RequestParam(value = "username",required = false) String username,
                                   @RequestParam(value = "password",required = false) String password,
                                   HttpServletResponse response) {
        OAuth2AccessToken token = oauth2RestTemplate.getAccessToken();
        return token;
    }
}
