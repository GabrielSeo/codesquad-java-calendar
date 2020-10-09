package gabriel.calendar;

import java.util.Scanner;

public class finaldaysofmonth {
	private static final int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDay(int month) {
		return days[month - 1];
	}
	public static void main(String[] arge) {
		String PROMPT = "cal> "; 
		Scanner scanner = new Scanner(System.in);
		finaldaysofmonth cal = new finaldaysofmonth();

//		System.out.println("횟수를 입력하세요");
//		int n = scanner.nextInt();
		
//		for(int i = 0; i < n; i++) {		 
		int month = 1;
		while(true) {
			System.out.println("몇 월:");
			System.out.print(PROMPT); 
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			System.out.printf("%d월의 마지막 날은 %d일 입니다.\n", month, cal.getMaxDay(month));
		}
		scanner.close();
		System.out.println("\n 끝났습니다");
	}
}
