package com.example.repository;

import com.example.role.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */

public interface UserRepository extends JpaRepository<User, Long> {
    /**
     *
     * @return 教师列表
     */
    @Query(nativeQuery = true, name = "User.findAllTeacher")
//    @Query(nativeQuery = true, value = "")
    List<User> findAllTeacher( );

}
