package day04_if;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	 
		
		//�����Ǻ� ���α׷�
		double sc;
		
		System.out.print("�����Է� : ");
		sc = input.nextDouble();
		
		if(sc >= 3.8) {
			System.out.println("�����մϴ�! ���б� ���� ������Դϴ�");
			}
		else {
			System.out.println("�ƽ����� ���б� ���� ����ڰ� �ƴմϴ�");
		}
		
		
		
		//�����Ǻ� ���α׷�
	int n1;
	System.out.print("�����Է� : ");
	n1 = input.nextInt();
	
	if(n1 >= 30) {
		System.out.println("30�� �̻��Դϴ�.");
	}
	else if(n1 >= 20) {
		System.out.println("20�� �Դϴ�.");
	}	
	else if(n1>=10){
		System.out.println("10�� �Դϴ�.");
	}
	else {
		System.out.println("10�뺸�� ��ϴ�");
	}
	
	
	
	//���� ���α׷�
	int n2;
	
	System.out.print("���ڸ� �Է��� �ּ���. : ");
	n2 = input.nextInt();
	
	if(n2>=3 && 5 >= n2) {
		System.out.println("���� ������ �� �Դϴ�");
	}
	else if(n2>=6 && 8 >= n2) {
		System.out.println("���� ������ ���� �Դϴ�");
	}
	else if(n2>=9 && 11 >= n2) {
		System.out.println("���� ������ ���� �Դϴ�");
	}
	else if(n2>=1 && 2 >= n2 || n2 ==12) {
		System.out.println("���� ������ �ܿ� �Դϴ�");
	}
	else {
		System.out.println("��Ȯ�� �Է����ּ���");
	}
	
	
	
	//������� ���
	int kor,mat,eng;
	double Sc;
	
	
	System.out.print("���� �����Է� : ");
	kor = input.nextInt();
	System.out.print("���� �����Է� : ");
	mat = input.nextInt();
	System.out.print("���� �����Է� : ");
	eng = input.nextInt();
	
	Sc = (kor+mat+eng)/3;
	
	System.out.println("���������"+Sc+"�� �Դϴ�.");
	if (Sc>=90) {
		System.out.println("A����Դϴ�.");
	}
	else if (Sc>=80) {
		System.out.println("B����Դϴ�.");
	}
	else if (Sc >= 70) {
		System.out.println("C����Դϴ�.");
	}
	else if (Sc >=60) {
		System.out.println("D����Դϴ�.");
	}
	else {
		System.out.println("F");
	}
	
	
	
	
	//�����Ǻ� ����(������Ǯ��)
	int Y;
	System.out.print("�⵵ �Է� : ");
	Y = input.nextInt();
	
	if(Y%400 == 0) {
		System.out.println("�����Դϴ�.");
	}
	else if(Y%100 == 0) {
		System.out.println("������ �ƴմϴ�.");
	}
	else if(Y%4 == 0) {
		System.out.println("�����Դϴ�.");
	}
	else {
		System.out.println("������ �ƴմϴ�.");
	}
	
	
	}
}
