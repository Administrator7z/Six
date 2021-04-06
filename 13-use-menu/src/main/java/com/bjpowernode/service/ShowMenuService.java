package com.bjpowernode.service;

import com.bjpowernode.model.Menu;

public class ShowMenuService {

    private MenuService file;
    private MenuService edit;

    public void setFile(MenuService file) {
        this.file = file;
    }

    public void setEdit(MenuService edit) {
        this.edit = edit;
    }

    public Menu showMenu(String m){
        Menu menu = null;
        if( "file".equals(m)){
            menu = file.getMenuItem();
        } else if("edit".equals(m)){
            menu = edit.getMenuItem();
        }
        return menu;
    }
}
