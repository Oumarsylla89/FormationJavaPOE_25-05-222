package fr.dawan.boucles;

import java.util.Scanner;

/*
 * DO-WHILE
 * Permet de repeter des instructions tant que la condition est verifi?e
 * Comme la condition est test?e ? a fin, on est s?re de passer dans le 
 * bloc d'instruction au moins une fois 
 */
public class BoucleDoWhile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age = 0;
		
		do {
			System.out.print("Entrer votre age : ");
			age = clavier.nextInt();
			if(age <= 0) {
				System.out.println("L'age doit ?tre positif");
			}
		}while(age < 0);
		
		System.out.println("Vous avez " + age + " ans");
	}

}
