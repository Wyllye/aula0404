package aula0404;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercicio1 {

	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("m");
		
		System.out.println("Hoje é " + sdf1.format(gc.getTime()) + ", dia " + sdf2.format(gc.getTime()) + " de " + sdf3.format(gc.getTime()) + " de " + gc.get(Calendar.YEAR) + " e agora são "  + sdf4.format(gc.getTime()) + " e " + sdf5.format(gc.getTime()) + " minutos.");                                                 
		
	}

}
