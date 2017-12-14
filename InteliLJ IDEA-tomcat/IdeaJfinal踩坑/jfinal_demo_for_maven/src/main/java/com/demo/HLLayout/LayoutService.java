package com.demo.HLLayout;


import com.demo.common.model.Dimmenu;
import com.jfinal.plugin.activerecord.Page;

import java.awt.*;

public class LayoutService {

    /**
     * 所有的 dao 对象也放在 Service 中
     */
    //	private static final Blog dao = new Blog().dao();
    private static final Dimmenu menu =new Dimmenu().dao();



    public java.util.List<Dimmenu> findById(int id) {
        return menu.dao.find("select * from t_dimmenu");
    }


}
