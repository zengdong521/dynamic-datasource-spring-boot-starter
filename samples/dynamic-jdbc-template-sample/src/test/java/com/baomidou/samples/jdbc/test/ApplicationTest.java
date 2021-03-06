package com.baomidou.samples.jdbc.test;

import com.baomidou.samples.jdbc.Application;
import com.baomidou.samples.jdbc.entity.User;
import com.baomidou.samples.jdbc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    private Random random = new Random();

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("测试用户" + random.nextInt());
        user.setAge(random.nextInt(100));
        userService.addUser(user);
    }

    @Test
    public void testSelectUser1() {
        userService.selectUser1();
    }

    @Test
    public void testSelectUser2() {
        userService.selectUser2();
    }

    @Test
    public void testSelectUser3() {
        userService.selectUser3();
    }
}
