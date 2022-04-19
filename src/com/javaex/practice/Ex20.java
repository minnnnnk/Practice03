package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("===========================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("===========================");
		int num1 = 29;
		
		while (true) {
			
			System.out.print(">>");
			num = sc.nextInt();
			if (num<num1) {
				System.out.println("더 높게"); 
				
			} else if(num>num1) {
				System.out.println("더 낮게");
				
			} else {
				System.out.println("맞았습니다"); 
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String choice = sc.next();
			
				if (choice.equals("y")) {
					System.out.println("===========================");
					System.out.println("     [숫자맞추기게임 종료]     ");
					System.out.println("===========================");
					break;
				} else {
					continue;
				}
			}
			
			
			
		
		
	
		
		
		
		}
		
		sc.close();
	}


}
