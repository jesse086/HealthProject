package com.itheima.health.service;

import com.itheima.health.pojo.CheckGroup;

public interface CheckGroupService {

    /**
     * 添加检查组
     * @param checkGroup 检查组信息
     * @param checkitemIds 选中的检查项id数组
     * @return
     */
    void add(CheckGroup checkGroup, Integer[] checkitemIds);
}
