package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.print("수 입력:");
		select = input.nextInt();
		switch(select) {
		case 1: System.out.println("1.시작 \n"+select+"게임을 시작합니다"); break;
		case 2: System.out.println("2.옵션 "+select); break;
		case 3: System.out.println("3.종료 : \n"+select+"게임을 종료합니다"); break;
		default: System.out.println("1,2,3을 제외한 다른 값 입력");
		
		}
	}
}
