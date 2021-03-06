package fr.dawan.syntaxe_de_base.entree_sortie_standard;

/**
 * 
 * @author Admin stagiaire
 * 
 * Nous allons voir la m?thode printf et String.format 
 * Elle nous permette d'afficher, de produire des chaines de caract?re format?es
 *
 */
public class FormatageDeChaineDeCaract?re {

	public static void main(String[] args) {
		int dividende = 25; 
		int diviseur = 11;
		
		/*
		 * Les sorties format?es : Le format de ce qui va ?tre affich?
		 * 
		 * %s Permet de formater une chaine de caract?re
		 * %c Permet de formater un caract?re 
		 * %d Permet de formater un entier en base d?cimale 
		 * %f Permet de formater un r?el sous forme decimale
		 * %n ou \n  retour ? la ligne
		 */
		
		// 1er solution : utilisation de println ==> [25/11]
		System.out.println("[" + dividende + "/" + diviseur + "]");
		
		//2?me solution : utilisation de la m?thode printf
		//Pour utiliser le printf on donne d'abord le format, puis ensuite les 
		//diff?rents arguments
		System.out.printf("[%d/%d]%n", dividende, diviseur);
		
		//3?me solution : Utilisation de String.format
		//Cette solution est identique ? System.out.printf
		//La diff?rence ?tant que String.format renvoie la chaine 
		//de caract?res apr?s formatage
		String str = String.format("[%d/%d]%n", dividende, diviseur); //[25/11]
		System.out.println(str);
		
		//Formater la valeur de PI sous forme decimal
		System.out.printf("%f%n", Math.PI);
		
		//Arrondir la valeur de PI avec 2 chiffres apr?s virgule 
		System.out.printf("%.2f\n", Math.PI);

	}

}
