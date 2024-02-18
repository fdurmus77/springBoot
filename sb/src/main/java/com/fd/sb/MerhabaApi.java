package com.fd.sb;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController // restfull servis olacak
// @RequestMapping("mesaj") // restfull servis in bu path in altında yayınlanmasını sağlacacak
@RequestMapping(method = RequestMethod.GET, value = "/api/mesaj")
@Api(tags = "MerhabaApi")// swagger dokumantasyonu için
public class MerhabaApi {
    @GetMapping// get servisi olacağını belirttim
    @ApiOperation(value = "merhaba metodu içerik")
    public String merhaba() {
        return "Merhaba";
    }


    @GetMapping({"/welcome", "/welcome/{name}"})
    public String welcome(@PathVariable(required = false) String name) {
        return "Hoş geldiniz. " + name;
    }

    @GetMapping(path = "/welcome2")
    public String welcome2(@RequestParam(name = "fname", required = false, defaultValue = "isminizi girin") String firstName) {
        return "Hoş geldiniz. " + firstName;
    }

}
