package cn.tedu.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Activity {
    private Long id;
    private String title;
    private String category;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;//java.util.Date
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;
    private String remark;
    private Integer state;
    private Date createdTime;
    private String createdUser; //有登陆模块的话，是登陆用户
}
