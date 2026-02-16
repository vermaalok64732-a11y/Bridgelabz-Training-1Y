package com.gla.methods.level3;

import java.util.Arrays;

public class NumberChecker3 {

    static int[] digits(int n){
        String s=""+n;
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }

    static int[] reverse(int[] d){
        int[] r=new int[d.length];
        for(int i=0;i<d.length;i++)
            r[i]=d[d.length-1-i];
        return r;
    }

    static boolean equal(int[] a,int[] b){
        return Arrays.equals(a,b);
    }

    static boolean palindrome(int[] d){
        return equal(d,reverse(d));
    }

    static boolean duck(int[] d){
        for(int x:d) if(x==0) return true;
        return false;
    }

    public static void main(String[] args){
        int n=1221;
        int[] d=digits(n);

        System.out.println("Palindrome="+palindrome(d));
        System.out.println("Duck="+duck(d));
    }
}
