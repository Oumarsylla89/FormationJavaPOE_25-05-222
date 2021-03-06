package fr.dawan.collections;


import java.util.*;

/*
 * Une collection de type Map est une collection qui fonctionne 
 * avec couple cl?-valeur
 * 
 * Ses classes d?riv?es sont : Hashtable, HashMap, TreeMap
 * 
 * D?claration et initialisation d'un Map : 
 * Le type de la cl? et le type de la valeur sont obligatoire 
 * 
 * 
 */
public class MapTest {

	public static void main(String[] args) {
		
		//Polymorphisme 
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Un");
		map.put("2", "Deux");
		map.put("3", "Trois");
		map.put("4", "Quatre");
		map.put("5", "Cinq");
		
		//Affiche les cl?s du map 
		System.out.println("Cl?s: " + map.keySet());
		
		//Affiche les valeurs du map 
		System.out.println("Values : " + map.values());
		
		//Afficher chaque cl? 
		for (String str : map.keySet()) {
			System.out.println(str + " ");
		}
		
		//Parcourir les ?l?ments du map 
		//L'interface  Entry est imbriqu? dans 
		//l'interface Map
		//Elle represente une entr?e, c'est une pair cl?/valeur 
		//d'un objet Map	
		System.out.println("\nParcourir les ?l?ments : ");
		for (Map.Entry<String, String> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " - " + mp.getValue());
		}
		
		System.out.println("\nm?thode remove : ");
		map.remove("1");
		System.out.println("Apr?s la suppression : " + map);
		
	}

}
