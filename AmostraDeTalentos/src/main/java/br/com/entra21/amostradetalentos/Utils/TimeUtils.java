package br.com.entra21.amostradetalentos.Utils;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
	
	public static final String PATTERN_DATA_PADRAO = "dd/MM/yyyy";

	private TimeUtils() {
		throw new UnsupportedOperationException();
	}

	public static Time parseData(String time, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String formatData(Time data, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(data);
	}
}
