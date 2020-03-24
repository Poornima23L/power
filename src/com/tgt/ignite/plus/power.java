package com.tgt.ignite.plus;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        int n,p,pow=1,i;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        n = read.nextInt();
        System.out.println("enter power");
        p = read.nextInt();
        for(i=1;i<=p;i++){
            pow*=n;
        }
        System.out.println(+n+ " to the power of" +p+ "is : " +pow);
    }
}
