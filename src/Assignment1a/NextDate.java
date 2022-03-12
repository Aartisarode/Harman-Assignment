package Assignment1a;
import java.time.LocalDate;
import java.util.Date;
public class NextDate {
	private static final long MILLIS_IN_A_DAY=1000*60*60*24;
	public static void main(String[] args) {
		Date today=new Date();
		System.out.println("Today     :: " + FindNextDay(today));
		System.out.println("Next Date :: " + FindNextDay(today));
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today     :: " + FindNextDay(today));
		System.out.println("Next Date :: " + FindNextDay(today));
	}
	private static Date FindNextDay(Date date)
	{
		return new Date(date.getTime() + MILLIS_IN_A_DAY);
	}
	private static LocalDate FindNextDay(LocalDate localdate)
	{
		return localdate.plusDays(1);
	}

}

