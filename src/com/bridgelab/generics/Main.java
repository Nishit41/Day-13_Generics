package com.bridgelab.generics;

public class Main {
    public static void main(String[] args) {
        MaxmiumValue maxNum = new MaxmiumValue();
        System.out.println("Test case 1");
        maxNum.getMaxValue(1, 3, 2);
        System.out.println("test case 2");
        maxNum.getMaxValue(22,28,4);
        System.out.println("Test case 3");
        maxNum.getMaxValue(55,60,45);
    }
}
