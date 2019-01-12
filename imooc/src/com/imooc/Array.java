package com.imooc;


import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Array myArrObj = new Array();

        int[] nums = {1, 2, 3};
        myArrObj.queryName(nums);

    }

    public void queryName(int[] nums) {

        System.out.println(Arrays.toString(nums));
    }

}
