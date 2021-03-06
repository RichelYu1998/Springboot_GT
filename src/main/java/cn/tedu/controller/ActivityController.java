package cn.tedu.controller;

import cn.tedu.pojo.Activity;
import cn.tedu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

@Controller
@RequestMapping("/activity/")
public class ActivityController{
    @Autowired
    private ActivityService activityService;
    /*
    * 查询所有
    * */
    @RequestMapping("doFindActivitys")
    public String doFindActivitys(Model model){
        List<Activity> list = activityService.findActivitys();
        model.addAttribute("list", list);
        return "activity";
    }
    /*
    * 删除操作
    * */
    @RequestMapping("doDeleteById")
    public String doDeleteById(Long id){
        activityService.deleteById(id);
        return "redirect:doFindActivitys";
    }
    /*
    * 保存数据
    * */
    @RequestMapping("doSaveObject")
    public String doSaveObject(Activity entity){
        System.out.println(entity);
        activityService.saveObject(entity);
        return "activity.html";
    }
    @RequestMapping("activity-add.html")
    public String doActivityAddUI(){
        return "activity-add";
    }
    /*
     * 基于id查询数据
     * */
    @RequestMapping("doFindById")
    public String doFindById(Long id,Model model){
        Activity aty = activityService.findById(id);
        model.addAttribute("aty",aty);
        return "activity-edit";
    }
    @RequestMapping("doUpdateObject")
    public String doUpdateObject(Activity entity){
        activityService.updateObject(entity);
        return "redirect:activity.html";
    }
}
