package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UtilAPIs {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Now is: "+date); // System Date Time Stamp
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/yy | hh:mm");
		
		String dateText1 = format1.format(date);
		String dateText2 = format2.format(date);
		String dateText3 = format3.format(date);
		
		System.out.println(">> dateText1 is: "+dateText1);
		System.out.println(">> dateText2 is: "+dateText2);
		System.out.println(">> dateText3 is: "+dateText3);
		
		// We get the reference to Calendar Object from getInstance() method
		Calendar calendar = Calendar.getInstance();
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH); // 0 to 11
		int yy = calendar.get(Calendar.YEAR);
		
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		
		System.out.println(dd+"/"+(mm+1)+"/"+yy+" | "+hh+":"+mi);
		
		// To Read Data from User
		Scanner scanner = new Scanner(System.in); // read Strings before Primitives always :)
		
		System.out.println(">> Enter Your Email: ");
		String email = scanner.nextLine();
		
		System.out.println(">> Enter Your Roll Number: ");
		int rollNum = scanner.nextInt();
		
		//double data = scanner.nextDouble();
		
		if(rollNum == 201 && email.equals("john@example.com")) {
			System.out.println(">> Data Validated. Please Start the Test");
		}else {
			System.out.println(">> We dont have entry for you.");
		}

		scanner.close();
	}

}
