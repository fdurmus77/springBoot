package com.fd.sb;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @GetMapping({"/welcome", "/welcome/{name}"})
    public String welcome(@PathVariable(required = false) String name) {
        return "Hoş geldiniz. " + name;
    }

    @GetMapping(path = "/welcome2")
    public String welcome2(@RequestParam(name = "fname", required = false, defaultValue = "isminizi girin") String firstName) {
        return "Hoş geldiniz. " + firstName;
    }
}
