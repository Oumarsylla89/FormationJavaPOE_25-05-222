package fr.dawan.syntaxe_de_base.variable;

public class VariableEtTypes {
	public static void main(String[] args) {
		
		//Declaration d'une variable 
		/*
		 * type nom_variable = valeur;
		 */
		
		//Type caract�re : char
		char c = 'a';
		char c1;
		c1 = 'b';
		
		//Type Entier : byte, short, int, long
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		//On peut forcer une valeur � �tre interpr�t�e comme un entier long 
		//en suffixant la valeur par L ou l
		long l2 = 100L;
	
		//Pour plus de visibilit�, il est �galement possible de s�parer les milliers 
		//par un underscore(_)
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de l3 : " + l3);
		
		//Les types � virgules flottante ou r�el: float, double
		double d1 = 5;
		System.out.println("Le contenu de d : " + d1); //5.0
		
		//Pour les variables de type float, il faut suffixer la valeur par F ou f
		float f = 0.5F;
		
		//Le type bool�en : boolean 
		boolean bool = true;
		
		//Type complexe 
		String str = "Dawan";
		int[] tab = {200, 300, 50};
	}
}
