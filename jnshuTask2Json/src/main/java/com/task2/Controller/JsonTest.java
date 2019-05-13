package com.task2.Controller;

import com.task2.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @ClassName JsonTest
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/11 20:57
 * @Version 1.0
 **/
@Controller
public class JsonTest {
    @RequestMapping(value = "test")
    /**@ResponseBody注解用于将Controller类的方法返回的对象，
     * 通过HttpMessageConverter接口转换为指定格式的数据如：json、xml等，通过Response响应给客户端。
     * */
     public String getStudentList(Model model){
        List<Student> students = new ArrayList<>();
         Student student1=new Student(1,"李伟川",1946931904,"java后端工程师",
                 "2019年3月11日","西华师范大学",12345,"www.baidu.com",
                 "希望找个好工作" ,"王志雄师兄","知乎",new Date(),new Date());
         students.add(student1);
        model.addAttribute("ob",students);
        return "json";
    }
}