package com.bridgelab.generics;

public class Main {
    public static void main(String[] args) {
        MaxmiumValue maxNum = new MaxmiumValue();
        System.out.println("Test case 1");
        maxNum.getMaxValue("Nishit","Ranjan", "Nishit");
        System.out.println("test cae 2");
        maxNum.getMaxValue(1.0f,5.0f,9.8f);
        System.out.println("test case 3");
        maxNum.getMaxValue(1,8,2);
    }
}
