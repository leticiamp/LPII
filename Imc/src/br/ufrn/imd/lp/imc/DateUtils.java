package br.ufrn.imd.lp.imc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static Date convertStringToDate(String date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;

		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return d;
	}
}
