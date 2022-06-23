package fr.dawan.tableauStatique;

import java.util.Scanner;

public class DeclarationEtInitialisation {

	public static void main(String[] args) {
	
		/*Les Tableaux 
		Nous verrons les tableaux statiques et les tableaux dynamiques (collections)
		Un tableau statique � une taille fixe 
		On ne peut pas le modifi� une fois d�clar�e. 
		Un tableau dynamique nous permet de cr�er des tableaux de taille dynamique 
		Nous pouvons augmenter et diminuer sa taille 
		Ces tableaux ne peuvent contenir que des r�f�rences vers des objets
		L'alternative aux tableaux statique, sont les tableaux dynamiques
		 
		                /*
		                 * Partie 1 : L'utilit� des tableaux
		                 */
		                Scanner clavier = new Scanner(System.in);
		                int age1, age2; 
		                double moyenne;
		                
		                System.out.println("Entrer l'age de l'utilisateur1 : ");
		                age1 = clavier.nextInt();
		                
		                System.out.println("Entrer l'age de l'utilisateur2 :");
		                age2 = clavier.nextInt();
		                
		                moyenne = (age1 + age2) / 2;
		                
		                System.out.println("La moyenne des ages est : " + moyenne);
		                
		                /*
		                 * Probl�me et solution : 
		                 * 
		                 * Probl�me : 
		                 * Supposons qu'on a une quantit� importante de donn�e (ex : 27 utilisateurs)
		                 * Il va falloir declarer 27 variables, ce qui est trop long, et illisible e
		                 * et une perte de temps pour le programmeur
		                 * 
		                 * Solution : 
		                 * Pour resoudre ce probl�me, on va utiliser les tableaux qui permettent 
		                 * de stocker des �l�ments de m�me type. 
		                 * 
		                 * Pour cet exemple on peut stocker un tableau d'entier
		                 * 
		                 */

	}

}
