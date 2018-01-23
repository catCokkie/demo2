package com.example.controller;


import com.example.repository.UserRepository;
import com.example.role.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;

    /**
     * 添加一个User
     *
     * @param loginName
     * @param password
     * @return
     */
    @PostMapping(value = "/user/add")
    public User userAdd( @RequestParam("loginName") String loginName,
                         @RequestParam("password") String password ) {

        User user = new User();

        user.setLoginName(loginName);

        user.setPassword(password);

        return userRepository.save(user);
    }

    /**
     * 删除用户 未实现
     *
     * @param loginName
     * @return
     */
    @DeleteMapping(value = "/user/delete{name}")
    public void userDelete( @RequestParam("name") String loginName ) {
        User user = new User();

        user.setLoginName(loginName);

//        return userRepository.delete(user);
    }

    /**
     * 查询所有老师
     * 参数
     *
     * @return
     */
    @GetMapping(value = "/user/getallteacher")
    public List<User> userGetTeacherAll() {

        List<User> users = userRepository.findAllTeacher();

        return users;
    }

    // URL示例： http://localhost:8080/hello/1
//    @RequestMapping(value = "/hello/{no}", method = RequestMethod.PUT)
//    public String sayHello( @PathVariable("no") Long no ) {
//
//        User user = userRepository.findOne(no);
//
//        if (user == null) {
//            return String.format("User NOT Found: %d", no);
//        }
//
//        String name = user.getLoginName();
//        return UserImportService.hello(name);
//    }

}
