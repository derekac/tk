package com.treasure.v2.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 */
@Controller
public class CommonView {

    @RequestMapping("admin-index")
    public String index() {
        return "index.vm";
    }

    @RequestMapping("admin-item-manager")
    public String nodeManagerUI() {
        return "itemManager.vm";
    }

    @RequestMapping("node-group-manager")
    public String nodeGroupManagerUI() {
        return "nodeGroupManager";
    }

}
