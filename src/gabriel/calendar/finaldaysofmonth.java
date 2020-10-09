package gabriel.calendar;

import java.util.Scanner;

public class finaldaysofmonth {
	private static final int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDay(int month) {
		return days[month - 1];
	}
	public static void main(String[] arge) {
		System.out.println("몇 월:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		finaldaysofmonth cal = new finaldaysofmonth();
		System.out.printf("%d월의 마지막 날은 %d일 입니다.", month, cal.getMaxDay(month));
		
		
	}
}
