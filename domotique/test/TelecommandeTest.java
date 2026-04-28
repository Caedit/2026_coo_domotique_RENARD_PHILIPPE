import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    /**
     * Test d'ajout d’une lampe à une télécommande vide
     */
    @Test
    public void testAjoutVide() {
        // methode testee
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouter(l);

        // verification

        assertEquals(l, t.getAppareils().getFirst(), "la lampe n'est pas presente");
        assertEquals(1, t.getAppareils().size(), "la liste devrait contenir une seul lampe");
    }

    /**
     * Test d'ajout d’une lampe à une télécommande avec 1 élément
     */
    @Test
    public void testAjout1Lampe() {
        //methode testee
        Telecommande t = new Telecommande();
        Lampe l0 = new Lampe("Lampe0");
        t.ajouter(l0);
        Lampe l = new Lampe("Lampe1");
        t.ajouter(l);

        //verification
        assertEquals(l, t.getAppareils().get(1),"la deuxième lampe n'est pas presente");
        assertEquals(2, t.getAppareils().size(), "la liste devrait contenir deux lampe");
    }


    /**
     * Test d'activation d'une lampe inexistante
     */
    @Test
    public void testActiverLampeInexistante(){
        // methode testee
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouter(l);
        boolean test = false;

        try {
            t.activer(1);
        }
        catch (IndexOutOfBoundsException e){
            test = true;
        }

        // verification
        assertTrue(test,"La méthode devrait renvoyer une exception");
    }
}
