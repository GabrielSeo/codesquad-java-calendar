package gabriel.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";  
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		finaldaysofmonth cal = new finaldaysofmonth();
 
		int month = 1;
		int year = 1; 
		while(true) {
			System.out.println("몇 년 :");
			System.out.print(PROMPT); 
			year = scanner.nextInt(); 
			System.out.println("몇 월 :");
			System.out.print(PROMPT); 
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			cal.printCalendar(year, month);
		}
		scanner.close();
		System.out.println("\n 끝났습니다");
	}
	public static void main(String[] arge) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
