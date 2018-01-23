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
public class Course {
    @Id
    @GeneratedValue
    @Column(length = 20, nullable = false)
    private Long no;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 1, nullable = false)
    private Integer credit;

    @Column(length = 2, nullable = false)
    private Integer  classHour;

    @Column(length = 50, nullable = false)
    private String teacherName;

    @Column(length = 180, nullable = false)
    private String contentValidity;

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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit( Integer credit ) {
        this.credit = credit;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour( Integer classHour ) {
        this.classHour = classHour;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName( String teacherName ) {
        this.teacherName = teacherName;
    }

    public String getContentValidity() {
        return contentValidity;
    }

    public void setContentValidity( String contentValidity ) {
        this.contentValidity = contentValidity;
    }
}
