package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		if (num%2!=0) {
			
			for (int i =0; i<=num ; i++) {
				if (i%2!=0) {
					sum=sum+i;
				}
			}
		} else {
			
			for (int i =0; i<=num ; i++) {
				if (i%2==0) {
					sum=sum+i;
				}
			}
		}
		System.out.println("결과값은: "+   sum);
		
		sc.close();
		
	}
}
