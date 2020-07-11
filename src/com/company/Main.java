package com.company;

public class Main {

    public static void main(String[] args) {
	long a=0;
	long b=0;
	//a代表富翁
        //b代表穷人
        a=10*30;
        //b=((1+30))*30/2;
        b=(long)(Math.pow(2,30)-1);
        System.out.println(a+" "+b);
    }
}
