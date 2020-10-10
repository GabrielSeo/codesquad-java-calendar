package gabriel.calendar;


public class finaldaysofmonth {
	private static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] Leap_days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			
			return true; 
		}
		
		else { 
			return false;
		}
		
	}
	
	public int getMaxDay(int year, int month) {
		if(isLeapYear(year)) {

			return Leap_days[month -1];
		}
		else {
			return days[month - 1];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년%2d월>>\n", year, month); 
		System.out.println(" 일  월  화  수  목  금 \n---------------------");
		
		
		int max = getMaxDay(year, month); 
		for(int i = 1; i <= max; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println("\n");
	}
}
