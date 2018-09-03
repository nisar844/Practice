import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String dtFormat = "HH:MM:SS";
		SimpleDateFormat dt = new SimpleDateFormat(dtFormat);
		System.out.println(dt.format(date));
		

	}

}
