package fr.dawan.lezzGo.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import fr.dawan.lezzGo.entities.User;

public class TestComparaisonDate {
	
	
	//obtenir une liste de date entre une date de début et une date de fin
	
	private List <User> userList;
	
	private static User user;
	
	
	
	//A TESTER
	//calcul de dates selon une date de début et de fin passées en paramètre par le user
	public static void calculDurée (Date dateDebut, Date dateFin) {
		
		GregorianCalendar cal = new GregorianCalendar();
		
		
		cal.setTime(dateDebut);
		
		//la liste de dates par utilisateurs
		List <Date> duration = new ArrayList<>();
		
		//tant que la boucle calendrier n'est pas arrivé à la date de fin en paramètre
		while (cal.before(dateFin)) {
			//on ajoute une date
			duration.add(cal.getTime());
			cal.add(GregorianCalendar.DATE, 1);
			
		}
		
		System.out.println(duration);
		
	}
		
		
	public static void trierDate (List <User> friends) {
		//liste de dates communes
		List<Date> commonLst = new ArrayList<>();
		
		//1ère boucle dans la liste des utilisateurs du projet
		for (int i = 0; i < friends.size(); i++) {
			//2ème boucle sur la liste des dates de chaque utilisateur
			for (int j = 0; j < user.getUser_date().size(); j++) {
				//si la liste n'est pas vide
				if(user.getUser_date() != null) {
					//et si la date(j) est égale à la date(j)
					if (user.getUser_date().get(j).equals(user.getUser_date().get(j))) {
						//alors la date s'ajoute à la liste des dates communes
						commonLst.add(user.getUser_date().get(j));
						
						//l'on supprimer les doublons de la liste communes
						commonLst.stream().distinct().collect(Collectors.toList());
					}
					
					System.out.println(commonLst);
				}
			}
		}
		//si le nombre d'éléments de la liste commune est égal au nombre de personne dans le projet
		if(commonLst.size() == friends.size()) {
			//alors on affiche la liste de dates
			System.out.println("Voici les dates communes " + commonLst);
		} else {
			System.out.println("il n'y a pas de dates communes");
		}
	}
	
	
	
	
}

	
	
		
		

	
	

	            
	
	


	


