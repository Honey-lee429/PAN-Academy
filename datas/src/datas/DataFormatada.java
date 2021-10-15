package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data FULL: " + f.format(data)); 
		//Pega a data do sistema operacional, no caso formato brasileiro
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data LONG: " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data MEDIUM: " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data SHORT: " + f.format(data));
		
		SimpleDateFormat datinha = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Data Formatada USA " + datinha.format(data));
		
	
	}
}
