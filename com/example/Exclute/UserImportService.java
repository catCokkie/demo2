package com.example.component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
@Service
public class UserImportService {
    public static String hello(String name) {
        return "Hello, " + name + "!";
    }
}
