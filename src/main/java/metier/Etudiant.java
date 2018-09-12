/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author yvan
 */
public class Etudiant {
    private String nom;
    private Notes notes;

    public Etudiant() {
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
    
    @Override
    public String toString() {
        int r = notes.calcul();
        
        if (r >= 10) {
            return nom + " : ADMIS";
        } else {
            return nom + " : RECALÉ";
        }
    }
}
