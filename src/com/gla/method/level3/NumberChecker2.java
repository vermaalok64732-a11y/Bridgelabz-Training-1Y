package com.gla.methods.level3;

public class NumberChecker2 {

    static int[] digits(int n){
        String s=""+n;
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }

    static int sum(int[] d){
        int s=0; for(int x:d)s+=x; return s;
    }

    static int squareSum(int[] d){
        int s=0;
        for(int x:d) s+=Math.pow(x,2);
        return s;
    }

    static boolean harshad(int n,int[] d){
        return n%sum(d)==0;
    }

    static void frequency(int[] d){
        int[][] f=new int[10][2];
        for(int i=0;i<10;i++) f[i][0]=i;

        for(int x:d) f[x][1]++;

        for(int i=0;i<10;i++)
            if(f[i][1]>0)
                System.out.println(i+" -> "+f[i][1]);
    }

    public static void main(String[] args){
        int n=21;
        int[] d=digits(n);

        System.out.println("Sum="+sum(d));
        System.out.println("Square Sum="+squareSum(d));
        System.out.println("Harshad="+harshad(n,d));
        frequency(d);
    }
}
