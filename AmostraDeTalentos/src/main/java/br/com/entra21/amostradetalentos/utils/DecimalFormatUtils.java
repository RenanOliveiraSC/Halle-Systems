package br.com.entra21.amostradetalentos.utils;

import java.text.DecimalFormat;

public class DecimalFormatUtils {

	public static String formatDecimal(double n) {
		DecimalFormat df = new DecimalFormat("#0.00");

		String numFormatado = df.format(n);

		return numFormatado;
	}
}
