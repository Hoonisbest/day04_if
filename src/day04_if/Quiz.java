package day04_if;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	 
		
		//학점판별 프로그램
		double sc;
		
		System.out.print("학점입력 : ");
		sc = input.nextDouble();
		
		if(sc >= 3.8) {
			System.out.println("축하합니다! 장학금 지금 대상자입니다");
			}
		else {
			System.out.println("아쉽지만 장학금 지급 대상자가 아닙니다");
		}
		
		
		
		//나이판별 프로그램
	int n1;
	System.out.print("나이입력 : ");
	n1 = input.nextInt();
	
	if(n1 >= 30) {
		System.out.println("30대 이상입니다.");
	}
	else if(n1 >= 20) {
		System.out.println("20대 입니다.");
	}	
	else if(n1>=10){
		System.out.println("10대 입니다.");
	}
	else {
		System.out.println("10대보다 어립니다");
	}
	
	
	
	//계절 프로그램
	int n2;
	
	System.out.print("숫자를 입력해 주세요. : ");
	n2 = input.nextInt();
	
	if(n2>=3 && 5 >= n2) {
		System.out.println("현재 계절은 봄 입니다");
	}
	else if(n2>=6 && 8 >= n2) {
		System.out.println("현재 계절은 여름 입니다");
	}
	else if(n2>=9 && 11 >= n2) {
		System.out.println("현재 계절은 가을 입니다");
	}
	else if(n2>=1 && 2 >= n2 || n2 ==12) {
		System.out.println("현재 계절은 겨울 입니다");
	}
	else {
		System.out.println("정확히 입력해주세요");
	}
	
	
	
	//성적평균 등급
	int kor,mat,eng;
	double Sc;
	
	
	System.out.print("국어 점수입력 : ");
	kor = input.nextInt();
	System.out.print("수학 점수입력 : ");
	mat = input.nextInt();
	System.out.print("영어 점수입력 : ");
	eng = input.nextInt();
	
	Sc = (kor+mat+eng)/3;
	
	System.out.println("평균점수는"+Sc+"점 입니다.");
	if (Sc>=90) {
		System.out.println("A등급입니다.");
	}
	else if (Sc>=80) {
		System.out.println("B등급입니다.");
	}
	else if (Sc >= 70) {
		System.out.println("C등급입니다.");
	}
	else if (Sc >=60) {
		System.out.println("D등급입니다.");
	}
	else {
		System.out.println("F");
	}
	
	
	
	
	//윤년판별 문제(내문제풀이)
	int Y;
	System.out.print("년도 입력 : ");
	Y = input.nextInt();
	
	if(Y%400 == 0) {
		System.out.println("윤년입니다.");
	}
	else if(Y%100 == 0) {
		System.out.println("윤년이 아닙니다.");
	}
	else if(Y%4 == 0) {
		System.out.println("윤년입니다.");
	}
	else {
		System.out.println("윤년이 아닙니다.");
	}
	
	
	}
}
