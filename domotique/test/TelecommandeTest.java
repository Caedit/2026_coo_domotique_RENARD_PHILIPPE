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
        t.ajouterLampe(l);

        // verification

        assertEquals(t.getLampes().getFirst(), l, "la lampe n'est pas presente");
        assertEquals(t.getLampes().size(), 1, "la liste devrait contenir une seul lampe");
    }

    /**
     * Test d'ajout d’une lampe à une télécommande avec 1 élément
     */
    @Test
    public void testAjout1Lampe() {
        //methode testee
        Telecommande t = new Telecommande();
        Lampe l0 = new Lampe("Lampe0");
        t.ajouterLampe(l0);
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);

        //verification
        assertEquals(t.getLampes().get(1), l, "la deuxième lampe n'est pas presente");
        assertEquals(t.getLampes().size(), 2, "la liste devrait contenir deux lampe");
    }


    /**
     * Test d'activation d'une lampe existante en position 0
     */
    @Test
    public void testActiverLampePos0(){
        // methode testee
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);
        t.activerLampe(0);

        // verification

        assertTrue(t.getLampes().getFirst().isAllume(), "la lampe 0 n'est pas allumee");
    }

    /**
     * Test d'activation d'une lampe existante en position 1
     */
    @Test
    public void testActiverLampePos1(){
        // methode testee
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerLampe(1);

        // verification

        assertTrue(t.getLampes().get(1).isAllume(), "la lampe 1 n'est pas allumee");
    }

    /**
     * Test d'activation d'une lampe inexistante
     */
    @Test
    public void testActiverLampeInexistante(){
        // methode testee
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");
        t.ajouterLampe(l);
        boolean test = false;

        try {
            t.activerLampe(1);
        }
        catch (IndexOutOfBoundsException e){
            test = true;
        }

        // verification
        assertTrue(test,"La méthode devrait renvoyer une exception");
    }
}
