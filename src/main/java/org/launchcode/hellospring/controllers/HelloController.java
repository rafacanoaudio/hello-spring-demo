package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * Created by Rafa Cano
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles a query of form hello?name=param
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value= "")
    public String helloWithQueryParam(@RequestParam String name) {return "Hello " + name + "!"; }

    // handles a path variable hello/pathvariable
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {return "Hello, " + name + "!";}

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" +
                "<input type = 'text' name = 'name'>" +
                "<input type = 'submit' value = 'Greet me'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
