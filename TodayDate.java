import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TodayDate {
public static void main(String[] args) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
	    System.out.println("Today Date is ::"+dateFormat.format(date));
	    }
	    }
