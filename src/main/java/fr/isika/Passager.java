package fr.isika;

import java.util.List;

public class Passager extends Utilisateur{
    List<Trajet> trajetSuivi;
    String destinationPrefere;
/**
* @param trajetSuivi est la liste des trajets empruntés par l'utilateur de type "passager"
* @param destinationPrefere est la String représentant la vile préférée par l'utilateur de type "passager"
*/
    public Passager(String nom, String villeDepart, String villeArrivee, List<Trajet> trajetSuivi, String destinationPrefere){
        super(nom, villeDepart, villeArrivee);
        this.trajetSuivi = trajetSuivi;
        this.destinationPrefere = destinationPrefere;
    
    }

    public void suivreTrajet(){

    }

    public void noterConducteur(){

    }
}

