/**  
 * @Title: UserController.java
 * @Package com.yjw.andy.controller
 * @Description: TODO
 * @author 余健文
 * @date 2016年9月14日
 */
package com.yjw.andy.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjw.andy.model.UserInfo;
import com.yjw.andy.service.UserService;  
/**  
 * @Title: UserController.java
 * @Package com.yjw.andy.controller
 * @Description: TODO
 * @author 余健文
 * @date 2016年9月14日
 */
@Controller  
@RequestMapping("/user")  
public class UserController {  
  
    @Autowired  
    private UserService userService;  
      
    @RequestMapping("/showInfo/{userId}")  
    public String showUserInfo(ModelMap modelMap, @PathVariable int userId){  
        UserInfo userInfo = userService.getUserById(userId);  
        modelMap.addAttribute("userInfo", userInfo);  
        return "/user/showInfo";  
    }  
      
    @RequestMapping("/showInfos")  
    public @ResponseBody Object showUserInfos(){  
        List<UserInfo> userInfos = userService.getUsers();  
        return userInfos;  
    }  
    
    /*
	 * This method will serve as default GET handler.
	 *
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		UserInfo userinfo = new UserInfo();
		model.addAttribute("userinfo", userinfo);
		return "/enroll";
	}

	/*
	 * This method will be called on form submission, handling POST request
	 * It also validates the user input
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid UserInfo userinfo, BindingResult result, ModelMap model){
      
		if(result.hasErrors()) {
		        return "/enroll";
		}
       
		model.addAttribute("success", "Dear "+ userinfo.getUname()+" error: "+result.getErrorCount()+" , your Registration completed successfully");
		return "/success";
	}
}  