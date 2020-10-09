package gabriel.calendar;

import java.util.Scanner;

public class printSampleCalendar {
	private static final int lastDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getLastDays(int month) {
		return lastDay[month - 1];
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		printSampleCalendar cal = new printSampleCalendar();
		
		System.out.println("달을 입력하세요 : ");
		int month = scanner.nextInt();
		System.out.println(" 일 월 화 수 목 금  \n ------------------");
		
		
		scanner.close();
		for(int i = 1; i<= cal.getLastDays(month); i++) {
			System.out.printf("%3d", i);
			if(i==7||i==14||i==21||i==28) {
				System.out.print("\n");
			}
		}
	}
	
	
}
