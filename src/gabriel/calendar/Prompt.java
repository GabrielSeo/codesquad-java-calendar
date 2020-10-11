package gabriel.calendar;

import java.util.Scanner;

public class Prompt {
	
	/**
	 * 
	 * @param week 요일
	 * @return 0 ~ 6 (0=Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else
			return 0; 
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		finaldaysofmonth cal = new finaldaysofmonth();
 
		int month = 1;
		int year = 1; 
		int weekday = 1;
		
		while(true) {
			System.out.println("몇 년 :(exit : -1)");
			System.out.print("연도> "); 
			year = scanner.nextInt(); 
			if(year == -1) {
				break; 
			}
			System.out.println("몇 월 :");
			System.out.print("월> "); 
			month = scanner.nextInt();
			System.out.println("시작 요일은?(su, mo, tu, we, th, fr, sa) :");
			System.out.print("요일> "); 
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday); 

			if(month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다."); 
				continue;
			}
			cal.printCalendar(year, month, weekday);
		}
		scanner.close();
		System.out.println("\n 끝났습니다");
	}
	public static void main(String[] arge) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
