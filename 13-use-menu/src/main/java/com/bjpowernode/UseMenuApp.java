package com.bjpowernode;

import com.bjpowernode.model.Menu;
import com.bjpowernode.service.ShowMenuService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMenuApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("menu-consumer.xml");

        ShowMenuService service = (ShowMenuService) ctx.getBean("showService");

        Menu menu = service.showMenu("file");
        System.out.println("调用文件菜单服务："+menu);

        menu = service.showMenu("edit");
        System.out.println("调用编辑菜单服务："+menu);
    }

}
