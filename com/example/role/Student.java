package com.example.role;

import javax.persistence.*;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
@Entity
@Table(
//        @Index(name = "ux_user_login_name", columnList = "loginName", unique = true), //
)
public class Student {
    @Id
    @GeneratedValue
    @Column(length = 20, nullable = false)
    private Long no;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 3, nullable = false)
    private Integer age;

    @Column(length = 18, nullable = false)
    private String idNumber;

    private enum Sex{
        MALE,FAMALE
    }

    @Column
    private Sex sex;
    public Long getNo() {
        return no;
    }

    public void setNo( Long no ) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber( String idNumber ) {
        this.idNumber = idNumber;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex( Sex sex ) {
        this.sex = sex;
    }

}
