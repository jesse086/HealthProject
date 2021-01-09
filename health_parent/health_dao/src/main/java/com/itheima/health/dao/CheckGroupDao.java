package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckGroupDao {
    /**
     * 添加检查组
     * @param checkGroup 检查组信息
     * @return
     */
    void add(CheckGroup checkGroup);

    /**
     * 添加检查组与检查项的关系
     * @param checkGroupId
     * @param checkitemId
     */
    void addCheckGroupCheckItem(@Param("checkGroupId") Integer checkGroupId, @Param("checkitemId")Integer checkitemId);

    /**
     * 检查项的分页查询
     * @param queryString
     * @return
     */
    Page<CheckGroup> findByCondition(String queryString);

    /**
     * 通过id查询检查组
     * @param id
     * @return
     */
    CheckGroup findById(int id);

    /**
     * 通过检查组id查询选中的检查项id
     *
     * @param id
     * @return
     */
    List<Integer> findCheckItemIdsByCheckGroupId(int id);

    /**
     * 修改检查组
     * @param checkGroup
     */
    void update(CheckGroup checkGroup);

    /**
     * 删除检查组和检查项之间的关系
     * @param id
     */
    void deleteCheckGroupCheckItem(Integer id);

    /**
     * 通过检查组id查询被套餐使用的个数
     * @param id
     * @return
     */
    int findCountByCheckGroupId(int id);

    /**
     * 通过id删除检查组
     * @param id
     */
    void deleteById(int id);

    /**
     * 查询所有的检查组
     * @return
     */
    List<CheckGroup> findAll();
}
