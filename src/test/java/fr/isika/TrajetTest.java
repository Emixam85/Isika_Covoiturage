package fr.isika;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TrajetTest {
    @Test
    public void ajouterPassagerTest(){
        List<Trajet> trajets = new ArrayList<Trajet>();
        List<Passager> passagers = new ArrayList<Passager>();
        Passager passager = new Passager("Jean-Claude", "Brest", "Agen", "Cannes");
        assertNotNull(passager);
        if (passager != null){
            for (Passager p : passagers) {
                if (p == passager)
                {
                    System.out.println("L'utilisateur "+passager+" existe déjà dans le système.");
                    break;
                }
                else{
                    assertTrue(passagers.add(passager),"Le passager a bien été ajouté à la liste des passagers");
                }
            }
        }
    }
    @Test
    public void calculerVitesseMoyenneTest()
    {
        int resultTest;
        int distanceT = 500;
        int dureeEstimeeT = 5;
        Trajet t = new Trajet("A", "B", distanceT, dureeEstimeeT,new Conducteur("JC", "A", "B", "CrashTest"));
        resultTest = t.calculerVitesseMoyenne();
        assertTrue(resultTest == (distanceT / dureeEstimeeT));
    }
}
