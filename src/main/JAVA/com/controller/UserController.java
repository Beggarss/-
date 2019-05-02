package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    private UserService service;
//
//    public void setService(UserService service) {
//        this.service = service;
//    }
    @Autowired
    private UserService userService=null;
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public ModelAndView getUser(@PathVariable("id") int id){
         ModelAndView mv = new ModelAndView();
         User user =userService.getUser(id);
         mv.addObject("user",user);
         mv.setView(new MappingJackson2JsonView());
         return mv;
    }
    @RequestMapping(value="/getJsonData")
    public ModelAndView getJsonData(@RequestParam("id") int id){
        User user=userService.getUser(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setView(new MappingJackson2JsonView());
        return mv;

    }
    @RequestMapping("/addRole")
    public ModelAndView addRole(RedirectAttributes redirectAttributes, int id ){
        ModelAndView mv = new ModelAndView();
        User user ;
        user=userService.getUser(id);
       // mv.addObject("user",user);
        redirectAttributes.addFlashAttribute("user",user);
//        ModelAndView mv = new ModelAndView();
//        User user = new User();
//        user.setPwd(pwd);
//        user.setUserName(userName);
//        userService.insertUser(user);
//       // mv.addObject(user);
//        mv.addObject("userNmae",userName);
//        mv.addObject("pwd",pwd);
//        mv.addObject("id",user.getId());
        mv.setViewName("redirect:./redirect");

        return mv;
    }
    @RequestMapping("/redirect")
    public ModelAndView redirect(User user){
        ModelAndView mv = new ModelAndView();
        //mv.setViewName("hello");
        mv.addObject("user",user);
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }
    @RequestMapping("/getHeaderAndCookie")
    public String testHeaderAndCookie(@RequestHeader(value="User-Agent",defaultValue = "attribute") String userAgent,@CookieValue(value="JSESSIONID",defaultValue = "MyJseeionid") String jsessionId){
        System.out.println("User-Agent:"+userAgent);

        System.out.println("JSESSIONID:"+jsessionId);
        return "hello";
    }

}
