import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//current date ..current time
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		
		System.out.println(sdf.format(d));
		System.out.print(d.toString());
		
		Calendar cal = Calendar.getInstance();     //get instance of the calendar
		

		
		
	}

}