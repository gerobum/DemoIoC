package main;

import metier.Etudiant;
import metier.MeilleureDesNotes;
import metier.Notes;

/**
 *
 * @author yvan
 */
public class Main {

    public static void main(String[] args) {
        MeilleureDesNotes notes = new MeilleureDesNotes();
        notes.setN1(2);
        notes.setN2(17);
        
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Toto");
        etudiant.setNotes(notes);
        
        System.out.println(etudiant);
    }
}
