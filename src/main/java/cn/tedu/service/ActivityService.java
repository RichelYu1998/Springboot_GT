package cn.tedu.service;

import cn.tedu.pojo.Activity;

import java.util.List;

public interface ActivityService {
    /*
    * 查询所有属性
    * */
    List<Activity> findActivitys();
    /*
    * 删除数据
    * */
    List<Activity> deleteById(Long id);
    /*
    * 保存数据
    * */
    int saveObject(Activity entity);
}
