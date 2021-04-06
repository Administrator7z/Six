package com.bjpowernode.service.impl;

import com.bjpowernode.model.Menu;
import com.bjpowernode.service.MenuService;

public class EditMenuService implements MenuService {
    @Override
    public Menu getMenuItem() {
        Menu menu = new Menu();
        menu.setName("编辑菜单");
        menu.setUrl("/edit");
        menu.setDesc("edit|copy|cut...");
        return menu;
    }
}
