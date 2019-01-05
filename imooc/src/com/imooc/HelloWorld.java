package com.imooc;

/**
 * @author lurenzhong@didichuxing.com
 * @version 1.0
 * @see HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("hello world! happy");
    }


    /**
     * 查询用户列表
     *
     * @param page     第几页
     * @param pageSize 每页大小
     * @return 返回用户列表
     * @throws RuntimeException,Exception
     */
    public String queryUserList(int page, int pageSize) {

        return "userList";
    }

}
