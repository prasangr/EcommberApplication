package com.example.EcommerceApplication.Controller;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

@RequestMapping("/")
public String hello() {
return "Hello World";
}

}
