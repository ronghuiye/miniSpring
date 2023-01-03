package io.ronghuiye.minispring.test.bean;

import io.ronghuiye.minispring.beans.factory.annotation.Autowired;
import io.ronghuiye.minispring.beans.factory.annotation.Value;
import io.ronghuiye.minispring.stereotype.Component;

import java.util.Random;

public class UserService implements IUserService {

    private String token;

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "ryan, 10001, boston, " + token;
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "registered: " + userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
