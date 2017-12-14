package com.demo.HLLayout;

import com.jfinal.core.Controller;

public class LayoutController extends Controller{

    static LayoutService service = new LayoutService();

    public void index() {

       setAttr("MenuList", service.findById(0));
        render("test.html");

    }
}
