package gabriel.calendar;

import java.util.Scanner;

public class finaldaysofmonth {
	private static final int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDay(int month) {
		return days[month - 1];
	}
	public static void main(String[] arge) {

		Scanner scanner = new Scanner(System.in);
		finaldaysofmonth cal = new finaldaysofmonth();

		System.out.println("횟수를 입력하세요");
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {		 
			System.out.println("몇 월:");
			int month = scanner.nextInt();
			System.out.printf("%d월의 마지막 날은 %d일 입니다.\n", month, cal.getMaxDay(month));
		}
		scanner.close();
		System.out.println("\n 끝");
	}
}
