package com.itheima.health.service;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

public interface CheckItemService {
    /**
     * 查询所有
     * @return
     */
    List<CheckItem> findAll();
}
