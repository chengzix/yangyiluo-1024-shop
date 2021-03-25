package net.xdclass.controller;


import net.xdclass.service.AddressService;
import net.xdclass.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 电商-公司收发货地址表 前端控制器
 * </p>
 *
 * @author ORANGE
 * @since 2021-03-25
 */
@RestController
@RequestMapping("/addressDO")
public class AddressController {


    @Autowired
    private AddressService addressService;


    @PostMapping("/test")
    public JsonData test(){
        addressService.getById(1);
        return JsonData.buildSuccess();
    }


}

