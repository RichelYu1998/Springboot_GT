package cn.tedu.controller;

import cn.tedu.pojo.Activity;
import cn.tedu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.text.SimpleDateFormat;
import java.util.Date;
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
        System.out.println("contontroller.entity"+entity);
        activityService.saveObject(entity);
        return "redirect:activity.html";
    }
    @RequestMapping("activity-add.html")
    public String doActivityAddUI(){
        return "activity-add";
    }
    /*
    * 日期手动转格式
    * */
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
