package fr.dawan.condition;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {
		
		/*
		 * Expression d'un test conditionnel 
		 * Si (condition est vraie) 
		 * 		instructions
		 *	Sinon
		 *		d'autres instructions
		 *
		 *Le bloc If (quand la condition est vraie)
		 *Le bloc Else (tous les autres cas : quand la condition  est la fausse)
		 *Le  bloc Else-If (traite un cas)
		 *
		 */
		
		Scanner clavier = new Scanner(System.in);
		int nbre = 0;
		
		System.out.print("Entrer un nombre svp : ");
		nbre = clavier.nextInt();
		
		if(nbre > 0) {
			System.out.println("Le nombre est positif");
		} else if(nbre == 0) {
			System.out.println("Le nombre est �gal � zero");
		} else if(nbre * nbre == 25) {
			System.out.println("Le nombre rentr� est �gale � " + nbre);
		}
		else {
			System.out.println("Le nombre est negatif ");
		}
		
		
		 boolean val = true;
		 if(val) {
			 System.out.println("val est est vraie");
		 } else {
			 System.out.println("val est faux");
		 }
		
		
		/*
		 * Op�rateurs de comparaisons : 
		 * Pour v�rifier les conditions, java propose plusieurs op�rateur de 
		 * comparaison : 
		 * > Permet de verifier si un nombre est superieur � un autre nombre 
		 * < Permet de verifier si un nombre est inferieur � un autre nombre
		 * == Pour verifier l'�galit� entre deux nombres 
		 * != (different) pour verifier si un nombre est different d'un autre 
		 * nombre
		 * <= (inferieur ou �gal)
		 * >= (Superieur ou �gal)
		 */
		
	}

}
