package com.lslhub.hello.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired private ObjectMapper objectMapper;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public ObjectNode test() {
        ObjectNode node = objectMapper.createObjectNode();
        node.put("name", "lsl233");
        node.put("age", 12);
        return node;
    }
}
