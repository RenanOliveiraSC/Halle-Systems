package br.com.entra21.amostradetalentos.utils;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatUtils {
	
	public static final String PATTERN_DECIMAL_PADRAO = "#0.00";

	private DecimalFormatUtils() {
		throw new UnsupportedOperationException();
	}

	public static double parseDecimal(String numero, String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			return (double) df.parse(numero);
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static String formatDouble(Double numero, String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		return df.format(numero);
	}
	
}
