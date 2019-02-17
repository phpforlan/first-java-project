package com.imooc.match;

public class Match {

    public static void main(String[] args) {

        String s = "0";

        String seriesStr = "";
        int noEqualIndex = 0;

        for (int i =0; i < s.length(); i++) {
            if (!s.substring(i,i+1).equals(s.substring(0,1))) {

                seriesStr = s.substring(0,i);
                break;

            }else {
                seriesStr = s.substring(0,i+1);
            }
        }

        System.out.println(seriesStr);

    }
}
