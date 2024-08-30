package com.xworkz.foodApp;

import com.xworkz.foodApp.zepto.Zepto;

public class ZeptoRunner {

    public static void main(String[] args){
        double val= Zepto.orderDetails("Chocofills",2);
        System.out.println(val);
        double value=Zepto.orderDetails("Hide and Seek",3);
        System.out.println(value);
    }
}
