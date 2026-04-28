import java.util.ArrayList;

public class Telecommande {
    //Attibuts
    private ArrayList <Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<>();
    }

    public void ajouter(Appareil a){
        this.appareils.add(a);
    }

    public void activer(int indice) throws IndexOutOfBoundsException {
        this.appareils.get(indice).allumer();
    }

    public void desactiver(int indice) throws IndexOutOfBoundsException {
        this.appareils.get(indice).eteindre();
    }

    public void activerTout() {
        for (Appareil a : appareils){
            a.allumer();
        }
    }

    public String toString(){
        String rt = "";
        for (Appareil a : appareils){
            rt += a + "\n";
        }
        return rt;
    }

    public ArrayList<Appareil> getAppareils() {
        return this.appareils;
    }

    public int getNombre(){
        return this.appareils.size();
    }
}
