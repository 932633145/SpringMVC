/**  
 * @Title: UserServiceImpl.java
 * @Package com.yjw.andy.service.Impl
 * @Description: TODO
 * @author 余健文
 * @date 2016年9月14日
 */
package com.yjw.andy.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjw.andy.dao.UserInfoMapper;
import com.yjw.andy.model.UserInfo;
import com.yjw.andy.service.UserService;

/**  
 * @Title: UserServiceImpl.java
 * @Package com.yjw.andy.service.Impl
 * @Description: TODO
 * @author 余健文
 * @date 2016年9月14日
 */
@Service("userService")  
public class UserServiceImpl implements UserService {  
  
    @Autowired  
    private UserInfoMapper userInfoMapper;  
  
    public UserInfo getUserById(int id) {  
        return userInfoMapper.selectByPrimaryKey(id);  
    }  
  
    public List<UserInfo> getUsers() {  
        return userInfoMapper.selectAll();  
    }  
  
    public int insert(UserInfo userInfo) {  
          
        int result = userInfoMapper.insert(userInfo);  
          
        System.out.println(result);  
        return result;  
    }  
  
}  