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
        // Grâce à l'interface INotes, il n'est plus nécessaire de modifier 
        // la classe Etudiant.
        // Elle est fermée à la modification et ouverte à l'exension
        // car on peut ajouter autant de nouveaux modes de calcul que
        // l'on veut à l'aide de classes qui implémentent INotes
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
