package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import metier.Etudiant;
import metier.INotes;
import metier.Meilleure;
import metier.Notes;

/**
 *
 * @author yvan
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, FileNotFoundException {
        // La classe Main n'est pas ouverte à l'extension.
        // On ne peut pas choisir entre MeilleureDesNotes ou Notes ou
        // un autre mode de calcul sans modifier le code et recompiler.
        
        // On peut utiliser l'intropection pour rendre paramétrable le mode
        // de calcul de la note finale.
        // INotes notes = new MeilleureDesNotes();
        Scanner in = new Scanner(new File("src/main/resources/config.txt"));
        
        
        INotes notes = (INotes) Class.forName(in.next()).newInstance();

        // notes.setN1(2);
        notes.getClass().getMethod("set"+in.next(), int.class).invoke(notes, in.nextInt());
        // notes.setN2(17);
        notes.getClass().getMethod("set"+in.next(), int.class).invoke(notes, in.nextInt());
        
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Toto");
        etudiant.setNotes(notes);
        
        System.out.println(etudiant);
    }
}
