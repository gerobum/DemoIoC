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
public class Moyenne implements INotes {
    private int n1, n2;
    
    public Moyenne() {
        
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    @Override
    public int calcul() {
        return (n1+n2)/2;
    }
}
