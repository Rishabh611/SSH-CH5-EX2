package com.rishabh;

import com.rishabh.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("Before retrieving the comment service");
        var s = context.getBean(CommentService.class);
        System.out.println("After retrieving the comment service");
    }
}