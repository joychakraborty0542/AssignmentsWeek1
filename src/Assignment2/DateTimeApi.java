package Assignment2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class DateTimeApi {
	
	

	public static void main(String[] args) {
		
		/*
		 * //Local Date LocalDate today =LocalDate.now(); System.out.println(today);
		 * 
		 * LocalDate DateObj=LocalDate.of(1994,9, 30); System.out.println(DateObj);
		 * //creating format DateTimeFormatter df =
		 * DateTimeFormatter.ofPattern("dd/MM/yy");
		 * 
		 * System.out.println(df.format(DateObj));
		 */
	 
	 //LocalDate we can manipulate date
		/*
		 * LocalDate newDate=LocalDate.now(); newDate=newDate.plusDays(2);
		 * System.out.println(newDate);
		 * 
		 * newDate = newDate.plusDays(34); System.out.println(newDate); // 2020-04-09
		 * 
		 * newDate = newDate.plusYears(45); // 2065-04-09
		 * 
		 * newDate = newDate.minusWeeks(87); // 2063-08-09
		 */	 
	//methods to get diff between two dates
	/*
	 * LocalDate today1 = LocalDate.now(); System.out.println(today1); LocalDate
	 * newDateObj = today1.minusWeeks(39); System.out.println(newDateObj);
	 * System.out.println(ChronoUnit.DAYS.between(newDateObj,today1));
	 */
	  
	 //Java8 provides us ChronoUnit which is an enum
//	System.out.println(today1.get(ChronoField.DAY_OF_MONTH));
	//-------------------------------Local Time---------------------------------------//
	
		LocalTime currentTime = LocalTime.now(); 	 
		System.out.println(currentTime);  
			
		/*
		 * LocalTime newTimeObj = LocalTime.of(9, 45, 59);
		 * System.out.println(newTimeObj); //09:45:59
		 */
		/*
		 * DateTimeFormatter df = DateTimeFormatter.ofPattern("h:mm:ss");
		 * System.out.println(df.format(currentTime));
		 */
			
		//TO GET HOUR SECONF AND MINUTE	
		LocalTime newTimeObj = LocalTime.of(9, 45, 59);
						
		  int hour=newTimeObj.getHour();
				int second = newTimeObj.getSecond();
			int minute = newTimeObj.getMinute();
	
				System.out.println(hour+":"+second+":"+minute); 
				
				newTimeObj.get(ChronoField.HOUR_OF_DAY);
				
	
		

		 
	
	

	 
	 
	 
	}

}
