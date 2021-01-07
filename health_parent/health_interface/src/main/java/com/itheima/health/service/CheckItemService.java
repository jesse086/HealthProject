package com.itheima.health.service;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

public interface CheckItemService {
    /**
     * 查询所有
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 添加检查项
     * @param checkItem
     */
    void add(CheckItem checkItem);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    CheckItem findById(int id);
}
