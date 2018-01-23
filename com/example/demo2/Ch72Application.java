package com.example.demo2;

import com.example.controller.UserController;
import com.example.repository.UserRepository;
import com.example.role.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
@EnableCaching
@EntityScan(basePackageClasses = User.class)
@Controller
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@ComponentScan(basePackageClasses = {
        UserController.class
})
@SpringBootApplication
public class Ch72Application {
    @RequestMapping("/")
    private String loginPage() {
        return "Login";
    }

    @RequestMapping("/user")
    private String userPage() {
        return "User";
    }

    public static void main( String[] args ) {
        SpringApplication.run(Ch72Application.class, args);
    }
}
