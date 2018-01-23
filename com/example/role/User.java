package com.example.role;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
@Entity
@Table(
//        @Index(loginName = "ux_user_login_name", columnList = "loginName", unique = true), //
)
@Component
public class User {
    @Id
    @GeneratedValue
    private Long no;

    @Column(length = 50, nullable = false)
    private String loginName;

    @Column(length = 20, nullable = false)
    private String password;

    private enum  role{
        /**
         * ADMINISTRATORS
         * TEACHER
         * STUDENTS
         */
        ADMINISTRATORS,TEACHER,STUDENTS
    }

    @Column
    private role role;


    public Long getNo() {
        return no;
    }

    public void setNo( Long no ) {
        this.no = no;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName( String loginName ) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public User.role getRole() {
        return role;
    }

    public void setRole( User.role role ) {
        this.role = role;
    }
}
