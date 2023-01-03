package io.ronghuiye.minispring.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "ryan1, boston, sovos");
        hashMap.put("10002", "ryan2, boston, fed");
        hashMap.put("10003", "ryan3, miami, ag");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
