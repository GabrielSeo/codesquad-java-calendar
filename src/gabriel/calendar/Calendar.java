package gabriel.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int MAX_DAYS[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxOfDays(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] agrs) {
		System.out.println("월 입력 : ");
		Scanner scanner = new Scanner(System.in);
		String mm = scanner.nextLine();
		int month = Integer.parseInt(mm);
		scanner.close();
		Calendar cal = new Calendar();
		
		System.out.printf("%d월의 마지막 날은 %d일 입니다." ,  month, cal.getMaxOfDays(month));
	}
	
}