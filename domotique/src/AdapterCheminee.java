/**
 * permet d'utiliser une cheminee en tant qu'appareil
 */

public class AdapterCheminee implements Appareil{
    private Cheminee ch;

    public AdapterCheminee(Cheminee c){
        this.ch = c;
    }

    /**
     * permet d'allumer
     */
    public void allumer() {
        this.ch.changerIntensite(this.ch.getLumiere()+10);
    }

    /**
     * permet d'eteindre
     */
    public void eteindre() {
        this.ch.changerIntensite(0);
    }

    public String toString() {
        return this.ch.toString();
    }
}
