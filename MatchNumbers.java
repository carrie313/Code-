package exer0;

import java.util.Scanner;

public class MatchNumbers {
public static void main(String[] args) {
	int answer = (int)(Math.random()*100)+1;
	int input = 0;
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	do {
		count++;
		System.out.print("1�� 100 ���� ���� �Է��ϼ���   ");
		input =sc.nextInt();

		if (answer==input) {
			System.out.println(+ count + "�� ����" + "������ϴ�.");
			System.out.println("������ �����մϴ�.");
			break;
		}else if (answer>=input) {
			System.out.println("�� ū ���� �Է��ϼ���   ");
		}else if(input<1 && input>100) {
			System.out.print("�߸��� ���� �Է��߽��ϴ�. 1�� 100���� ���� �Է��ϼ���!  ");
		}
		else {
			System.out.println("�� ���� ���� �Է��ϼ���. ");
		}
	}while(true);
}
}

