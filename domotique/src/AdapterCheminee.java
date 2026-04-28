/**
 * permet d'utiliser une cheminee en tant qu'appareil
 */

public class AdapterCheminee {
    private Cheminee ch;

    public AdapterCheminee(Cheminee c){
        this.ch = c;
    }

    /**
     * permet d'allumer
     */
    public void allumer() {

    }

    /**
     * permet d'eteindre
     */
    public void eteindre() {
        this.ch.changerIntensite(0);
    }

    public String toString() {
        return ch.toString();
    }
}
