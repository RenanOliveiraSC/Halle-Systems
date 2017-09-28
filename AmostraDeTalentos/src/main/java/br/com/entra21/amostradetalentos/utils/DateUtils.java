package br.com.entra21.amostradetalentos.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

	public static final String PATTERN_DATA_PADRAO = "dd/MM/yyyy";

	private DateUtils() {
		throw new UnsupportedOperationException();
	}

	public static Date parseData(String data, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String formatData(Date data, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(data);
	}
	
	public static Date parseData(String data, String patternData, String hora, String patternHora) {
		String dataConverter = data+" "+hora;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternData+" "+patternHora);
        try{
            Date date = simpleDateFormat.parse(dataConverter);
            System.out.println("date : "+simpleDateFormat.format(date));
            return date;
        }catch (ParseException ex){
            System.out.println("Exception "+ex);
            return null;
        }
	}
	
}
