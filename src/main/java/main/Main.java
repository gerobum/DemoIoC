package main;

import java.util.Scanner;

/**
 *
 * @author yvan
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; ++i) {
            System.out.print("Entre ton nom : ");
            String nom = in.next();
            System.out.print("Entre une note : ");
            int n1 = in.nextInt();
            System.out.print("Entre une note : ");
            int n2 = in.nextInt();

            System.out.println("Ta note finale, " + nom + ", est " + (n1 + n2) / 2);
        }

        /*while (c != 0) {
        int c = -1;
            System.out.println("Que voulez-vous faire\n"
                    + " (1) somme\n"
                    + " (2) produit\n"
                    + " (3) plus petite\n"
                    + " (4) plus grande\n"
                    + " (5) moyenne\n"
                    + "\n"
                    + " (0) quitter\n");
            System.out.print("Donnez votre choix : ");
            c = in.nextInt();
            
            switch(c) {
                case 1:
                    
            }
        }*/
    }
}
