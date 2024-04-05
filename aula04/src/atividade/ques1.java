package atividade;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class ques1 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println(sdf.format(d));
		
		System.out.println("horas: "+ c.get(Calendar.HOUR_OF_DAY)+ ":"+ c.get(Calendar.MINUTE) );
			
		}
		

}
