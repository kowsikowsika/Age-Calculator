import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[]args) {
		 int b_day,b_month,b_year;
		 int c_day,c_month,c_year;

		Scanner sc=new Scanner(System.in);
	  //get birth details from user
	  System.out.println("enter birth date:");
	  b_day=sc.nextInt();
	  System.out.println("enter birth month:");
	  b_month=sc.nextInt();
	  System.out.println("enter birth year:");
	  b_year=sc.nextInt();
	  //get current date from system
	  c_day=java.time.LocalDate.now().getDayOfMonth();
	  c_month=java.time.LocalDate.now().getMonthValue();
	  c_year=java.time.LocalDate.now().getYear();
	  
	  //check condition
	  if(c_year>=b_year&&c_month>=b_month&&c_day>=b_day) {
		  b_day=c_day-b_day;
		  b_month=c_month-b_month;
		  b_year=c_year-b_year;
		  //print age 
		  System.out.println("your age: "+b_year+"year "+b_month+"month "+b_day+"days ");
	  }
	  else {
		 b_day=(c_day+30)-b_day;
		 c_month--;
		 c_month+=b_day/30;
		 b_day=b_day%30;
		 //find months
		 b_month=(c_month+12)-b_month;
		 c_year--;
		 c_year+=b_month/12;
		 b_month=b_month%12;
		 //find year
		 b_year=c_year-b_year;
		 //print age
		 
		  System.out.println("your age: "+b_year+"years: " +b_month+"months: "+b_day+"days:");
		 
	  }
	  
	}
	}


