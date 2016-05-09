package net.fengni.mkeeper.server.controller;

import net.fengni.jdbc.query.Page;
import net.fengni.mkeeper.server.model.Category;
import net.fengni.mkeeper.server.service.CategoryService;
import net.fengni.mkeeper.server.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2015/9/3.
 */
@Controller
public class CategeryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/category/save.go")
    public String save(Model model, HttpServletRequest request, HttpServletResponse response) {
        int id = RequestUtil.getRequestInt(request,"id");
        String name = RequestUtil.getRequestString(request,"name");
        Category category;
        if(id>0){
            category = categoryService.get(id);
            category.setName(name);
            categoryService.update(category);
        }else {
            category = new Category();
            category.setName(name);
            categoryService.insert(category);
        }
        return "category/list";


    }

    @RequestMapping(value = "/category/list.go")
    public String list(Model model,HttpServletRequest request, HttpServletResponse response,Page<Category> page) {
        categoryService.fillPage(page);
        model.addAttribute("page",page);
        return "category/list";
    }

    @RequestMapping(value = "/category/toEdit.go")
    public String toEdit(Model model,HttpServletRequest request, HttpServletResponse response) {
        int id = RequestUtil.getRequestInt(request,"id");
        Category category = null;
        if(id>0){
            category = categoryService.get(id);
        }
        model.addAttribute("category",category);
        return "category/edit";

    }

    @RequestMapping(value = "/category/delete.go")
    public String delete(HttpServletRequest request, HttpServletResponse response) {
        int id = RequestUtil.getRequestInt(request,"id");
        categoryService.delete(id);
        return "list";
    }
}
