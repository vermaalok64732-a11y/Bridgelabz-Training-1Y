package com.gla.methods.level3;

public class NumberChecker1 {

    static int countDigits(int n){
        return String.valueOf(n).length();
    }

    static int[] storeDigits(int n){
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for(int i=0;i<s.length();i++)
            d[i]=s.charAt(i)-'0';
        return d;
    }

    static boolean isDuck(int[] d){
        for(int x:d) if(x==0) return true;
        return false;
    }

    static boolean isArmstrong(int n,int[] d){
        int sum=0,p=d.length;
        for(int x:d) sum+=Math.pow(x,p);
        return sum==n;
    }

    static void largestTwo(int[] d){
        int max=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int x:d){
            if(x>max){second=max;max=x;}
            else if(x>second) second=x;
        }
        System.out.println("Largest="+max+" Second="+second);
    }

    static void smallestTwo(int[] d){
        int min=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int x:d){
            if(x<min){second=min;min=x;}
            else if(x<second) second=x;
        }
        System.out.println("Smallest="+min+" Second="+second);
    }

    public static void main(String[] args){
        int n=153;
        int[] d=storeDigits(n);

        System.out.println("Digits="+countDigits(n));
        System.out.println("Duck="+isDuck(d));
        System.out.println("Armstrong="+isArmstrong(n,d));
        largestTwo(d);
        smallestTwo(d);
    }
}
