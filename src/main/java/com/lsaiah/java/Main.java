package com.lsaiah.java;

public class Main {
    public static void main(String[] args) {
        try {
            String token = login("admin", "pass");
            System.out.println("Token: " + token);
        }catch (LoginFailedException | UserNotFoundException e){
            e.printStackTrace();
        }
    }
    static String login(String username, String password){
        if (username.equals("admin")){
            if (password.equals("password")){
                return "xxx";
            }else {
                throw new LoginFailedException("登录失败：用户名或密码错误");
            }
        }else{
            throw new UserNotFoundException("用户不存在");
        }
    }
}
