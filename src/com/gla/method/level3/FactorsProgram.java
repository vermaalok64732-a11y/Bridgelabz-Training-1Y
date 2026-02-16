package com.gla.methods.level3;

public class FactorsProgram {

    static int[] factors(int n){
        int count=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) count++;

        int[] f=new int[count];
        int j=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) f[j++]=i;

        return f;
    }

    public static void main(String[] args){
        int n=12;
        int[] f=factors(n);

        int sum=0,prod=1,cubeProd=1;
        for(int x:f){
            sum+=x;
            prod*=x;
            cubeProd*=Math.pow(x,3);
        }

        System.out.println("Greatest="+f[f.length-1]);
        System.out.println("Sum="+sum);
        System.out.println("Product="+prod);
        System.out.println("Cube Product="+cubeProd);
    }
}
