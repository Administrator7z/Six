package com.bjpowernode.service.impl;

import com.bjpowernode.model.Menu;
import com.bjpowernode.service.MenuService;

public class FileMenuService implements MenuService {
    @Override
    public Menu getMenuItem() {
        Menu menu = new Menu();
        menu.setName("文件菜单");
        menu.setUrl("/file");
        menu.setDesc("File|open|save....");
        return menu;
    }
}
