package fr.dawan.entree_sortie_standart;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objet = new + constructeur
        Scanner input = new Scanner(System.in);
        
        int n = 0; 
        double var1 = 0.0;
        
        System.out.print("Entrer un nombre entier : ");
        n = input.nextInt();
        System.out.println("Le carré de " + n + " est " + n*n);
        
        System.out.print("Entrer un nombre réel : ");
        var1 = input.nextDouble();
        System.out.println("Vous avez entré : " + var1);
	}

}
