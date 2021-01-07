package com.itheima.health.controller;

import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    @GetMapping("/findAll")
    public Result findAll(){
        //调用服务查询
        List<CheckItem>list = checkItemService.findAll();
        //封装到Result返回数据
        return new Result(true, MessageConstant.QUERY_CHECKITEM_FAIL,list);
    }
}
