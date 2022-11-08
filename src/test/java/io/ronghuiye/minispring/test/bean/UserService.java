package io.ronghuiye.minispring.test.bean;

public class UserService {

    private String uId;
    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("query user info: " + userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
