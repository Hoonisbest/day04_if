package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.print("�� �Է�:");
		select = input.nextInt();
		switch(select) {
		case 1: System.out.println("1.���� \n"+select+"������ �����մϴ�"); break;
		case 2: System.out.println("2.�ɼ� "+select); break;
		case 3: System.out.println("3.���� : \n"+select+"������ �����մϴ�"); break;
		default: System.out.println("1,2,3�� ������ �ٸ� �� �Է�");
		
		}
	}
}
