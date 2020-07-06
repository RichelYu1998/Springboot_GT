package cn.tedu.dao;

import cn.tedu.pojo.Activity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActivityDao {
    /*
    * 查询数据
    * */
    @Select("select * from tb_activity order by createdTime desc")
    List<Activity> findActivitys();
    /*
    * 删除数据
    * */
    @Delete("delete from tb_activity where id=#{id}")
    int deleteById(Long id);
    /*
    * 保存数据
    * */
    int insertObject(Activity entity);
}
