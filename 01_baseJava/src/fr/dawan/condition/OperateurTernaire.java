package fr.dawan.condition;

public class OperateurTernaire {

	public static void main(String[] args) {
		int nbre = 10;
		String str = "";
		
		/*
		 * Instruction If-Else
		 */
		if(nbre > 0) {
			str = "Positif";
		} else {
			str= "N�gatif";
		}
		System.out.println("Instruction if-else: " + str);
		
		/*
		 * Op�rateur Ternaire : forme condens�e de l'instruction if-else
		 * qui renvoie une valeur
		 * Syntaxe ==> Condition ? Instruction1 : Instruction2
		 */
		str = nbre > 0 ? "Positif" : "N�gatif";
		
		System.out.println("operateur ternaire : " + str);
	}

}
