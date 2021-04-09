package com.bjpowernode.controller;

import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.SysUser;
import com.bjpowernode.vo.Zoo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class StudyThymleafController {

    //标准变量表达式
    @GetMapping("/thy/expression1")
    public String expression1(Model model){
        //简单类型
        model.addAttribute("myname","李思思");
        model.addAttribute("classname","bj2013");

        //对象类型
        model.addAttribute("myuser", new SysUser(1001,"马超","m",20));
        return "01-express1";
    }

    //选择变量表达式
    @GetMapping("/thy/expression2")
    public String expression2(Model model){
        //对象类型
        model.addAttribute("myuser", new SysUser(1002,"黄冲","m",22));
        return "02-express2";
    }


    //链接表达式
    @GetMapping("/thy/link")
    public String link(Model model){
        //对象类型
        model.addAttribute("stuId",1001);
        return "03-link";
    }

    //测试链接的地址
    @GetMapping("/query/student")
    @ResponseBody
    public String queryStudent(Integer id){
        return "查询一个参数：id="+id;
    }

    //测试链接的地址
    @GetMapping("/find/school")
    @ResponseBody
    public String findSchool(String name, Integer id){
        return "查询学生id="+id+",在那个学校="+name;
    }


    // html属性
    @GetMapping("/thy/htmlproperty")
    public String htmlProperty(Model model){
        model.addAttribute("myname","章丽丽");
        model.addAttribute("method","post");
        return "04-htmlproperty";
    }

    // eachList
    @GetMapping("/thy/eachList")
    public String eachList(Model model){
        List<String> strList = new ArrayList<>();
        strList.add("三国");
        strList.add("三国志");
        strList.add("三国演义");
        model.addAttribute("strList",strList);

        //对象集合
        List<SysUser> userList = new ArrayList<>();
        userList.add( new SysUser(5001,"李忠","m",20));
        userList.add( new SysUser(5002,"周仓","m",22));
        userList.add( new SysUser(5003,"孙二娘","f",26));
        userList.add( new SysUser(5004,"李逵","m",28));
        userList.add( new SysUser(5005,"扈三娘","f",30));
        model.addAttribute("userList",userList);

        return "05-eachList";
    }


    // eachArray
    @GetMapping("/thy/eachArray")
    public String eachArrary(Model model){


        //对象集合
        SysUser users [] = new SysUser[3];
        users[0] = new SysUser(1001,"马超","m",30);
        users[1] = new SysUser(1002,"赵云","m",20);
        users[2] = new SysUser(1003,"黄忠","m",80);
        model.addAttribute("userArray",users);

        return "06-eachArray";
    }

    // eachMap
    @GetMapping("/thy/eachMap")
    public String eachMap(Model model){
        Map<String,SysUser> map = new HashMap<>();

        map.put("user1", new SysUser(1001,"马超","m",30));
        map.put("user2", new SysUser(1003,"黄忠","m",80));

        model.addAttribute("usermap",map);

        return "07-eachMap";
    }


    // if ,unless
    @GetMapping("/thy/ifUnless")
    public String ifUnless(Model model){
        model.addAttribute("isLogin",true);
        model.addAttribute("sex","m");
        model.addAttribute("name","lisi");
        model.addAttribute("order",null);
        return "08-ifunless";
    }


    // inline
    @GetMapping("/thy/inline")
    public String inline(Model model){
        model.addAttribute("isLogin",true);
        model.addAttribute("sex","m");
        model.addAttribute("name","lisi");
        model.addAttribute("order",null);
        model.addAttribute("user",new SysUser(1001,"黄忠","m",80));
        return "09-inline";
    }

    //内置对象
    @GetMapping("/thy/inobject")
    public String inObject(HttpServletRequest request,Model model){
        request.setAttribute("myname","李强");
        model.addAttribute("myclass","一班");

        //向session中添加数据
        request.getSession().setAttribute("mysess","周一");

        return "10-inobject";

    }

    //内置工具类
    @GetMapping("/thy/utils")
    public String inUtils(Model model){

        model.addAttribute("mydate",new Date());
        model.addAttribute("mynum",26.695);
        model.addAttribute("mystr","bjpowernode");

        List<String> strList = Arrays.asList("a","b","c");
        model.addAttribute("strlist",strList);

        //创建Zoo
        Cat cat  = new Cat();
        cat.setName("tom猫");

        Zoo zoo = new Zoo();
        //zoo.setCat(cat);

        model.addAttribute("zoo",zoo);

        return "11-inutils";

    }


    //使用自定义模板
    @GetMapping("/thy/tpl")
    public String tpl(Model model){
        return "12-tpl";
    }
}
