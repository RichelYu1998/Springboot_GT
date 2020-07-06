package cn.tedu.service.impl;

import cn.tedu.dao.ActivityDao;
import cn.tedu.pojo.Activity;
import cn.tedu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityDao activityDao;
    /*
     * 查看所有信息
     * */
    @Override
    public List<Activity> findActivitys() {
        return activityDao.findActivitys();
    }
    /*
    * 删除数据
    * */
    @Override
    public int deleteById(Long id) {
        return  activityDao.deleteById(id);
    }
    /*
     * 保存数据
     * */
    @Override
    public int saveObject(Activity entity) {
        return activityDao.insertObject(entity);
    }
}
