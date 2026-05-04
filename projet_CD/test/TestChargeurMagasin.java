import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestChargeurMagasin {
    @Test
    public void testchargerMagasinValide() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        Magasin m = cm.chargerMagasin();
        assertEquals(12,m.getNombreCds(),"il devrait y avoir 12 CDs");
    }

    @Test
    public void testchargerMagasinNonValide(){
        ChargeurMagasin cm = new ChargeurMagasin("jexistepas");
        boolean res = false;
        try{
            Magasin m = cm.chargerMagasin();
        } catch (FileNotFoundException e){
            res = true;
        }
        assertTrue(res,"le fichier ne devrait pas exister");
    }

}
