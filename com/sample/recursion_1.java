package com.sample;

public class recursion_1 {
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }                               //print upto n
        System.out.println(n);
        printNum(n-1);
    }
    public static void sumNum(int i, int n, int sum) {
        if(i == n) {
            sum += i;                       // Sum of n
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNum(i+1, n, sum);
    }

    public static void main(String[] args) {
	// write your code here
        printNum(5);
        sumNum(1,5,0);
    }
}
