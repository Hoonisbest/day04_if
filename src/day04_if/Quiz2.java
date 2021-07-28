package day04_if;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		String H=null,C=null;
		
	/*	while(true)
		{
			System.out.print("날짜 입력:");
			n1 = input.nextInt();
		switch(n1%7) {
			
		case 1: System.out.println("월"); break;
		case 2: System.out.println("화"); break;
		case 3: System.out.println("수"); break;
		case 4: System.out.println("목"); break;
		case 5: System.out.println("금"); break;
		case 6: System.out.println("토"); break;
		case 0: System.out.println("일"); break;
			}
		}*/
		
		
		while(true)
		{
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록 보기");
		System.out.println("4.종료");
		System.out.print("번호를 선택하시오:");
		n2 = input.nextInt();
		
		switch(n2) {
		case 1:System.out.print("우리집 목적지 입력 : ");
				H = input.next();break;
		case 2:System.out.print("2.회사 등록 : ");
				C = input.next();break;
		case 3:System.out.println("우리집 : "+H+"\n회사 : "+C);break;
		
		
			}
		if(n2==4) {
			break;}
		}
	
	
	}
}
