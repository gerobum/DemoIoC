
package metier;

/**
 * Le calcul de la moyenne ne fonctionne pas bien pour certains étudiants.
 * On aimerait changer le principe de calcul et ne retenir que la meilleure
 * des deux notes.
 * 
 * Mais on souhaite conserver la classe Notes parce qu'elle est toujours
 * utilisée ailleurs.
 * 
 * À cause du couplage fort entre Etudiant et Notes, il faut créer et une 
 * nouvelle classe MeilleureDesNotes semblable à Notes et surtout modifier
 * Etudiant.
 * 
 * On dit que la classe Etudiant n'est pas fermée à la modification
 * 
 * @author yvan
 */
public class Etudiant {
    private String nom;
    private INotes notes;

    public Etudiant() {
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNotes(INotes notes) {
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
