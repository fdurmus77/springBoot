package com.fd.sb;

import io.swagger.annotations.Api;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
// @RequestMapping(path = "/api")
@Api(tags = "MyController")// swagger dokumantasyonu için
public class MyController {

    @GetMapping("admin")
    public String admin () {
        return "Admin rolü görebilir mesajı";
    }

    @GetMapping("/index")
    public String index(){
        return "index sayfası";
    }
    @GetMapping("/dashboard")
    public String dashboarh(){
        return "Login başarılı dashboard sayfası";
    }
}
