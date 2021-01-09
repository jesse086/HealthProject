package com.itheima.health.service;

import com.itheima.health.entity.PageResult;
import com.itheima.health.entity.QueryPageBean;
import com.itheima.health.pojo.CheckGroup;
import com.itheima.health.pojo.CheckItem;

import java.util.List;

public interface CheckGroupService {

    /**
     * 添加检查组
     * @param checkGroup 检查组信息
     * @param checkitemIds 选中的检查项id数组
     * @return
     */
    void add(CheckGroup checkGroup, Integer[] checkitemIds);

    /**
     * 检查项的分页查询
     * @param queryPageBean
     * @return
     */
    PageResult<CheckGroup> findPage(QueryPageBean queryPageBean);

    /**
     * 通过id查询检查组
     * @param id
     * @return
     */
    CheckGroup findById(int id);

    /**
     * 通过检查组id查询选中的检查项id
     * @param id
     * @return
     */
    List<Integer> findCheckItemIdsByCheckGroupId(int id);
}
