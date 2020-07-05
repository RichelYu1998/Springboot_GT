package cn.tedu;

import cn.tedu.pojo.Activity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
public class ActivityTests {
    @Test
    public void testAty01(){
        Activity aty = new Activity();
        aty.setId(10L);
        aty.setTitle("A-Title");
        aty.setCategory("A-Type");
        System.out.println(aty.getId());
        System.out.println(aty.getTitle());
        System.out.println(aty.getCategory());
        log.info(aty.toString());
    }
}
