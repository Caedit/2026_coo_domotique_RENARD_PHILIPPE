import java.util.ArrayList;

public class Telecommande {
    //Attibuts
    private ArrayList <Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lamp){
        this.lampes.add(lamp);
    }

    public void activerLampe(int indiceLampe) throws IndexOutOfBoundsException {
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) throws IndexOutOfBoundsException {
        this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : lampes){
            l.allumer();
        }
    }

    public String toString(){
        String rt = "";
        for (Lampe l : lampes){
            rt += l + "\n";
        }
        return rt;
    }

    public ArrayList<Lampe> getLampes() {
        return lampes;
    }
}
