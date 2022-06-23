package fr.dawan.boucle;

import java.util.Scanner;

public class BoucleDoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int age = 0;
        
        do {
                System.out.print("Entrer votre age : ");
                age = input.nextInt();
                if(age <= 0) {
                        System.out.println("L'age doit être positif\n");
                }
        }while(age < 0);
        
        System.out.println("Vous avez " + age + " ans");
        


	}

}
