import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMagasin {
    @Test
    public void testMagasinTrieCD() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        Magasin m = cm.chargerMagasin();

        m.trierAlbum();

        assertEquals("Believe", m.getCd(0).getNomCD(), "le premier titre n'est pas bon");
        assertEquals("Whitney Houston", m.getCd(m.getNombreCds()-1).getNomCD(), "le dernier titre n'est pas bon");
    }

    @Test
    public void testMagasinTrieArtiste() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        Magasin m = cm.chargerMagasin();

        m.trierArtiste();

        assertEquals("Bénabar", m.getCd(0).getNomArtiste(), "le premier Artiste n'est pas bon");
        assertEquals("Zebda", m.getCd(m.getNombreCds()-1).getNomArtiste(), "le dernier Artiste n'est pas bon");
    }

}
