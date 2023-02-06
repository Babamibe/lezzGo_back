package fr.dawan.lezzGo.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class TestComparaisonDate {
	
	
	//obtenir une liste de date entre une date de début et une date de fin
	
	
	//Date convertie en string
	public static String listDate (Date dateDebut, Date dateFin) {
				
		//instanciation d'un gregorian calendar
		GregorianCalendar calendar = new GregorianCalendar();
		
		//initialisation de la date de départ
		calendar.setTime(dateDebut);
		String listDate = "";
		
		//ajout de dates dans une boucle while avant la date de fin en paramètre
		while (calendar.before(dateFin)) {
			listDate = listDate + calendar.getTime() + ";";
			calendar.add(GregorianCalendar.DATE, 1);
		}
		System.out.println(listDate);
		return listDate;
		
		
		
	}
	
	//A TESTER
	//Liste de date
	public static List <Date> lstDate (Date dateDebut, Date dateFin) {
		
		SimpleDateFormat df = new SimpleDateFormat("dd, mm, yyy");

		GregorianCalendar calendar = new GregorianCalendar();
		
		calendar.setTime(dateDebut);
		List<Date> lstDate = new ArrayList<>();
		
		while (calendar.before(dateFin)) {
			lstDate.add(calendar.getTime());
			calendar.add(GregorianCalendar.DATE, 1);
		}
		
		System.out.println(df.format(lstDate));
		return lstDate;
		
		
	}
	
	/*CREATION D UNE 3EME LISTE CONTENANT LES ELEMENTS COMMUNS DES 2 AUTRES LISTES
	 * 
	 * lst 1
	 * lst 2
	 * 
	 * for (int i = 0; l1.size(); i++) {
	 * 	if (l1.get(i).equals(l2.get(i))) {
	 * 	l3.add(i)}
	 * }
	 *}
	 *
	 * sysout(l3)
	 * 
	 * */

	}
	


	            
	
	


	


