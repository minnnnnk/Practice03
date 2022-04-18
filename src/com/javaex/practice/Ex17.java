package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int y = 0;
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		for(y = num ; y<=num; y++) {
			for (i = 0; i<=y ; i--) {
			System.out.print("*");
			}
		} System.out.println("");
		sc.close();
	}
}
