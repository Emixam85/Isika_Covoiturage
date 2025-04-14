package fr.isika;

import java.util.ArrayList;
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
        this.trajetSuivi = new ArrayList<Trajet>();
        this.destinationPrefere = destinationPrefere;
    }

     public Passager(String nom, String villeDepart, String villeArrivee, String destinationPrefere){
        super(nom, villeDepart, villeArrivee);
        this.trajetSuivi = new ArrayList<Trajet>();
        this.destinationPrefere = destinationPrefere;
    
    }

    public void suivreTrajet(Trajet trajet){
       /*   if (this.trajetSuivi != null){ */
        trajetSuivi.add(trajet);//}
        /* else{
            this.trajetSuivi = ;
        } */
    }

    public void noterConducteur(){

    }
 // Gets & Sets
    public List<Trajet> getTrajetSuivi() {
        return trajetSuivi;
    }

    public void setTrajetSuivi(List<Trajet> trajetSuivi) {
        this.trajetSuivi = trajetSuivi;
    }

    public String getDestinationPrefere() {
        return destinationPrefere;
    }

    public void setDestinationPrefere(String destinationPrefere) {
        this.destinationPrefere = destinationPrefere;
    }
    
}

