package com.ucbcba.taller.controllers;

import com.ucbcba.taller.entities.Category;
import com.ucbcba.taller.entities.User;
import com.ucbcba.taller.services.CategoryService;
import com.ucbcba.taller.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {
    private CategoryService categoryService;
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){this.userService = userService;}

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    String save(Category category) {

        categoryService.saveCategory(category);
        return "redirect:/Categories";
    }

    @RequestMapping("/newCategory")
    String newRestaurant(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        if(user.isAdmin()) {
            Iterable<Category> categories = categoryService.listAllCategories();
            model.addAttribute("categories", categories);
            return "newCategory";
        }
        else{
            return "redirect:/Categories";
        }
    }

    @RequestMapping(value = "/Categories" ,method = RequestMethod.GET)
    String showCat(Model model) {
        Iterable<Category> cateList = categoryService.listAllCategories();
        model.addAttribute("cateList",cateList);
        return "showCategories";
    }

    @RequestMapping(value = "/userCategories" ,method = RequestMethod.GET)
    String showCatUser(Model model) {
        Iterable<Category> cateList = categoryService.listAllCategories();
        model.addAttribute("cateList",cateList);
        return "showCategoriesUser";
    }

    @RequestMapping(value = "/publicCategories" ,method = RequestMethod.GET)
    String showCatPub(Model model) {
        Iterable<Category> cateList = categoryService.listAllCategories();
        model.addAttribute("cateList",cateList);
        return "showCategoriesPublic";
    }

    @RequestMapping(value = "/showCategories",method = RequestMethod.GET)
    public String showCategories(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        if(user.isAdmin()) {
            return "redirect:/Categories";
        }
        else{
            return "redirect:/userCategories";
        }
    }

    @RequestMapping("/showCategory/{id}")
    String showRes(@PathVariable Integer id, Model model) {
        Category cate = categoryService.getCategory(id);
        model.addAttribute("cate", cate);
        return "showCategory";
    }


    @RequestMapping("/deleteCategory/{id}")
    String delete(@PathVariable Integer id) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        if(user.isAdmin()) {
            categoryService.deleteCategory(id);
        }
        return "redirect:/Categories";
    }

    @RequestMapping("/editCategory/{id}")
    String editPost(@PathVariable Integer id, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByUsername(auth.getName());
        if(user.isAdmin()) {
            Category cate = categoryService.getCategory(id);
            model.addAttribute("cate", cate);
            return "editCategory";
        }
        else{
            return "redirect:/Categories";
        }
    }
}
