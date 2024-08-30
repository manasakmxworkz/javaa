package com.xworkz.ottPlatform;

import com.xworkz.ottPlatform.amazonPrime.Prime;

public class PrimeRunner {

    public static void main(String[] args){
        Prime prime=new Prime();
        prime.setPrimeId(123);
        prime.setEmail("baba123@gmail.com");
        prime.setPassWord("Baba@12");
        prime.setPlatformName("Amazon Prime");
        prime.setSubscriptionFee(1499.00);
        System.out.println("Your OTT Platform Info is:" +prime);


        Prime prime1=new Prime();
        prime1.setPrimeId(234);
        prime1.setEmail("babi123@gmail.com");
        prime1.setPassWord("Babi@12");
        prime1.setPlatformName("Netflix");
        prime1.setSubscriptionFee(149.00);
        System.out.println("Your OTT Platform Info is:" +prime1);


        Prime prime2=new Prime();
        prime2.setPrimeId(12);
        prime2.setEmail("abd123@gmail.com");
        prime2.setPassWord("Abd@12");
        prime2.setPlatformName("Disney+Hotstar");
        prime2.setSubscriptionFee(399.00);
        System.out.println("Your OTT Platform Info is:" +prime2);
    }
}
