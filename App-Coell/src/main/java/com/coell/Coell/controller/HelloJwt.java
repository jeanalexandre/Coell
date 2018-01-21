package com.coell.Coell.controller;

import com.coell.Coell.model.JwtUser;
import com.coell.Coell.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloJwt {

    @Autowired
    private UtilisateurController userService;

    @Autowired
    private JwtService jwtService;

    @GetMapping(value = "/api/secure/hello/{name}")
    public ResponseEntity<?> helloSecure(@PathVariable String name)
    {
        String result = String.format("Hello JWT, %s! (Secure)", name);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/api/public/hello/{name}")
    public ResponseEntity<?> helloPublic(@PathVariable String name)
    {
        String result = String.format("Hello JWT, %s! (Public)", name);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/api/public/auth")
    public ResponseEntity<?> auth(@RequestBody AuthDTO auth) {
        String userName = auth.getUserName();
        String passWord = auth.getPassWord();
        Boolean correctCredentials = userService.authenticate(userName, passWord);
        if (correctCredentials) {
            JwtUser jwtUser = new JwtUser(userName, passWord);
            return ResponseEntity.ok(jwtService.getToken(jwtUser));
        }
        return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
    }
}
