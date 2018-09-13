package metier;

/**
 *
 * @author yvan
 */
public class MeilleureDesNotes implements INotes {

    private int n1, n2;

    public MeilleureDesNotes() {

    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    @Override
    public int calcul() {
        return Math.max(n1, n2);
    }
}
