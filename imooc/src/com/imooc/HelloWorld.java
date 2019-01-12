package com.imooc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lurenzhong@didichuxing.com
 * @version 1.0
 * @see HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {

        int[] scores = {89, -23, 64, 91, 119, 52, 73};

        HelloWorld hello = new HelloWorld();
        hello.printScore(scores);

    }

    /**
     * 打印考试成绩前三名
     *
     * @param scores
     */
    public void printScore(int[] scores) {
        Arrays.sort(scores);

        int num = 1;
        for (int i = scores.length - 1; i >= 0 && num <= 3; i--) {
            if (scores[i] < 0 || scores[i] > 100) {
                continue;
            }
            num++;
            System.out.println(scores[i]);
        }

    }

}
