package com.bridgelab.generics;

public class MaxmiumValue {
    void getMaxValue(float val1, float val2, float val3){
        if((val1>(val2)) && ((val1>(val3))))
            System.out.println(val1+ " is the largest");

        else if ((val2>(val1)) && (val2>(val3)) ) {
            System.out.println(val2+" is largest");
        }
        else{
            System.out.println(val3+" is largest");

        }
    }

}
