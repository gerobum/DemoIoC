package main;

import metier.Etudiant;
import metier.INotes;
import metier.MeilleureDesNotes;
import metier.Notes;

/**
 *
 * @author yvan
 */
public class Main {

    public static void main(String[] args) {
        // La classe Main n'est pas ouverte à l'extension.
        // On ne peut pas choisir entre MeilleureDesNotes ou Notes ou
        // un autre mode de calcul sans modifier le code et recompiler.
        MeilleureDesNotes notes = new MeilleureDesNotes();
        //Notes notes = new Notes();
        notes.setN1(2);
        notes.setN2(17);
        
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Toto");
        etudiant.setNotes(notes);
        
        System.out.println(etudiant);
    }
}
