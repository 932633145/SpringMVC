/**  
 * @Title: UserService.java
 * @Package com.yjw.andy.service
 * @Description: TODO
 * @author 余健文
 * @date 2016年9月14日
 */
package com.yjw.andy.service;

import java.util.List;

import com.yjw.andy.model.UserInfo;

/**  
 * @Title: UserService.java
 * @Package com.yjw.andy.service
 * @Description: TODO
 * @author 余健文
 * @date 2016年9月14日
 */
public interface UserService {  
	  
    UserInfo getUserById(int id);  
      
    List<UserInfo> getUsers();  
      
    int insert(UserInfo userInfo);  
}  