package com.bridgelab.generics;

public class MaxmiumValue {
    void getMaxValue(String val1, String val2, String val3){
        if( ((val1).compareTo(val2)>0) && ((val1).compareTo(val3)>0))
            System.out.println(val1+ " is the largest");
        else if( ((val2).compareTo(val1)>0) && ((val2).compareTo(val3)>0)) {
            System.out.println(val2+" is largest");
        }
        else{
            System.out.println(val3+" is largest");
        }
    }
}
