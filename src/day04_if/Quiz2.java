package day04_if;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		String H=null,C=null;
		
	/*	while(true)
		{
			System.out.print("��¥ �Է�:");
			n1 = input.nextInt();
		switch(n1%7) {
			
		case 1: System.out.println("��"); break;
		case 2: System.out.println("ȭ"); break;
		case 3: System.out.println("��"); break;
		case 4: System.out.println("��"); break;
		case 5: System.out.println("��"); break;
		case 6: System.out.println("��"); break;
		case 0: System.out.println("��"); break;
			}
		}*/
		
		
		while(true)
		{
		System.out.println("1.�츮�� ���");
		System.out.println("2.ȸ�� ���");
		System.out.println("3.��� ����");
		System.out.println("4.����");
		System.out.print("��ȣ�� �����Ͻÿ�:");
		n2 = input.nextInt();
		
		switch(n2) {
		case 1:System.out.print("�츮�� ������ �Է� : ");
				H = input.next();break;
		case 2:System.out.print("2.ȸ�� ��� : ");
				C = input.next();break;
		case 3:System.out.println("�츮�� : "+H+"\nȸ�� : "+C);break;
		
		
			}
		if(n2==4) {
			break;}
		}
	
	
	}
}
