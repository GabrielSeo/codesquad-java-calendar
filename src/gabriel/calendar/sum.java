package gabriel.calendar;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		String a1 = scanner.nextLine();
		String b1 = scanner.nextLine();
		scanner.close();
		
		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		int result = a + b;
		
		System.out.printf("두 수의 합은 %d입니다.", result);
		
		
	}

}
