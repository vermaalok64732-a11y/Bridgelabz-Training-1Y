package com.gla.methods.level3;

import java.util.HashSet;

public class OTPGenerator {

    static int generateOTP(){
        return 100000 + (int)(Math.random()*900000);
    }

    public static void main(String[] args){

        int[] otp=new int[10];
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<10;i++){
            otp[i]=generateOTP();
            set.add(otp[i]);
            System.out.println(otp[i]);
        }

        if(set.size()==10)
            System.out.println("All OTPs Unique");
        else
            System.out.println("Duplicate OTP Found");
    }
}
