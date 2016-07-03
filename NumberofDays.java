import java.util.Scanner;

public class NumberofDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the month name:" );
		Scanner sc=new Scanner(System.in);
		int months=sc.nextInt();
		int year=2016;
		int numdays=0;
		
		switch(months) {
		case 1:
		case 3:	
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		numdays=31;
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
		numdays=30;
		break;
		case 2:
			  if ( ((year % 4 == 0) && !(year % 100 == 0))
	                     || (year % 400 == 0) )
	                {
				  numdays = 29;
	                }
	                else
	                	numdays = 28;
	                break;
		default:
				System.out.print("Invalid" );
				break;
		}
		System.out.print("There are " + numdays + " days in this month");
	}

}
