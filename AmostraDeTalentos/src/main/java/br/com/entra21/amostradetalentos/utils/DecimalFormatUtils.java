package br.com.entra21.amostradetalentos.utils;

import java.text.DecimalFormat;

public class DecimalFormatUtils {

	static DecimalFormat df = new DecimalFormat("#0.00");

	public static String formatDecimal(double n) {

		String numFormatado = df.format(n);

		return numFormatado;
	}

	public static double formatToDouble(String numeroS) {

		double numeroD = Double.parseDouble(numeroS);

		return numeroD;
	}
}
