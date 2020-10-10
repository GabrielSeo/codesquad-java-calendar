package gabriel.calendar;


public class finaldaysofmonth {
	private static final int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDay(int month) {
		return days[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년%2d월>>\n", year, month); 
		System.out.println(" 일  월  화  수  목  금 \n---------------------");
		finaldaysofmonth f = new finaldaysofmonth();
		
		
		int max = f.getMaxDay(month); 
		for(int i = 1; i <= max; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == 0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
	}
}
