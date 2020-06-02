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
		System.out.print("1과 100 사이 값을 입력하세요   ");
		input =sc.nextInt();

		if (answer==input) {
			System.out.println(+ count + "번 만에" + "맞췄습니다.");
			System.out.println("게임을 종료합니다.");
			break;
		}else if (answer>=input) {
			System.out.println("더 큰 수를 입력하세요   ");
		}else if(input<1 && input>100) {
			System.out.print("잘못된 값을 입력했습니다. 1과 100사이 값을 입력하세요!  ");
		}
		else {
			System.out.println("더 작은 수를 입력하세요. ");
		}
	}while(true);
}
}

