package main;

import metier.Etudiant;
import metier.Notes;

/**
 *
 * @author yvan
 */
public class Main {

    public static void main(String[] args) {
        Notes notes = new Notes();
        notes.setN1(12);
        notes.setN2(17);
        
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Toto");
        etudiant.setNotes(notes);
        
        System.out.println(etudiant);
    }
}
