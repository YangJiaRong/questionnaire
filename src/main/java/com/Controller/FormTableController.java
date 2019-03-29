package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * @ CreateDate : Create in 16:02 2019/3/27
 * @ Explain :
 * @ UpdateDate : Update in
 * @ Author : Eestill
 */
@Controller
public class FormTableController {

    @RequestMapping(value = "/getForm")
    public void GetForm(HttpServletRequest request , HttpServletResponse response){
        //用于存放用户个人信息
        //姓名|性别|出生日期|身份证号码
        String userInfo = "";

        Map<String,String[]> map = request.getParameterMap();

        Iterator<Map.Entry<String,String[]>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String,String[]> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + Arrays.toString(entry.getValue()));
        }
        System.out.println("---------------------------");
        System.out.println("姓名(name)：" + Arrays.toString(map.get("name")));
        System.out.println(map.get("name")[0]);
        userInfo += map.get("name")[0]  + "|";
        System.out.println("---------------------------");
        System.out.println("性别(sex)：" + Arrays.toString(map.get("sex")));
        System.out.println(map.get("sex")[0]);
        userInfo += map.get("sex")[0]  + "|";
        System.out.println("---------------------------");
        System.out.println("出生日期(birthday)：" + Arrays.toString(map.get("birthday")));
        System.out.println(map.get("birthday")[0]);
        userInfo += map.get("birthday")[0] + "|";
        System.out.println("---------------------------");
        System.out.println("身份证号码(id)：" + Arrays.toString(map.get("id")));
        System.out.println(map.get("id")[0]);
        userInfo += map.get("id")[0];
        System.out.println("---------------------------");



        //输出查看整合提交的信息
        System.out.println("用户信息------>" + userInfo);
    }
}
