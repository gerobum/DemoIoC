package main;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import metier.Etudiant;
import metier.INotes;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        // Scanner in = new Scanner(new File("src/main/resources/config.txt"));
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("config.xml");
        
        //INotes notes = (INotes) Class.forName(in.next()).newInstance();
        INotes notes = (INotes) context.getBean("notes"); 

        // notes.setN1(2);
        //notes.getClass().getMethod("set"+in.next(), int.class).invoke(notes, in.nextInt());
        // notes.setN2(17);
        // notes.getClass().getMethod("set"+in.next(), int.class).invoke(notes, in.nextInt());
        
        
        //Etudiant etudiant = new Etudiant();
        
        Etudiant etudiant = (Etudiant) context.getBean("etudiant"); 
        etudiant.setNom("Toto");
        // etudiant.setNotes(notes);
        System.out.println("\n-------------------------\n");
        System.out.println(etudiant);
        System.out.println("-------------------------\n");
    }
}
