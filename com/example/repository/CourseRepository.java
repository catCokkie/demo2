package com.example.repository;

import com.example.role.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */

public interface CourseRepository extends JpaRepository<Course, Long> {

}
