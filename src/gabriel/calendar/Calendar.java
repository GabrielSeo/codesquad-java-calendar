package gabriel.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxOfDays(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		System.out.println("원하는 달을 입력하세요 :");
		Scanner scanner = new Scanner(System.in); 
		int month = scanner.nextInt();
		Calendar cal = new Calendar();
		
		System.out.printf("%d월은 %d일까지 있습니다.",  month, cal.getMaxOfDays(month));
		scanner.close();
	}
}