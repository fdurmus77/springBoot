package com.fd.sb;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // restfull servis olacak
// @RequestMapping("mesaj") // restfull servis in bu path in altında yayınlanmasını sağlacacak
@RequestMapping(method = RequestMethod.GET, value = "/api/mesaj")
@Api(tags = "Merhaba Servisi")// swagger dokumantasyonu için
public class MerhabaApi {
    @GetMapping// get servisi olacağını belirttim
    @ApiOperation(value = "merhaba metodu içerik")
    public String merhaba(){
        return "Merhaba";
    }
}
