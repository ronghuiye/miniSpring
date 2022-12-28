package io.ronghuiye.minispring.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("execute: init-method");
        hashMap.put("10001", "ryan");
        hashMap.put("10002", "ryan2");
        hashMap.put("10003", "ryan3");
    }

    public void destroyDataMethod() {
        System.out.println("execute: destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
