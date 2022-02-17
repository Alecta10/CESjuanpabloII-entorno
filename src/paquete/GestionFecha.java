package paquete;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class GestionFecha {

    public static Date getRandomDate() {
	
        Random rand = new Random();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 2, 9);
		long start = cal.getTimeInMillis();
		cal.set(2012, 10, 1);
		long end = cal.getTimeInMillis();
		Date d = new Date(start + (long) (rand.nextDouble() * (end - start)));
		System.out.println(format.format(d));
		System.out.println("ejhdg");
		return d;

	}
}


