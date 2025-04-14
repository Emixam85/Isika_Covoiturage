/**
 * Cette classe represente la structure de chaque utilisateur de type conducteur
 */
package fr.isika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conducteur extends Utilisateur{
    private String voiture;
    private List<Trajet> trajets = new ArrayList<Trajet>();

/**
* @param nom est la String représentant le nom de l'utilisateur
* @param villeDepart est la String représentant la vile de depart
* @param villeArrivee est la String représentant la vile d'arrivee
* @param voiture représente le véhicule du conducteur
* @param trajets représente les différents trajet(s) du conducteur
*/
    public Conducteur(String nom, String villeDepart, String villeArrivee, String voiture){
        super(nom, villeDepart, villeArrivee);
        this.voiture = voiture;
        //this.trajets = trajets;
    }

    public Conducteur(String nom, String villeDepart, String villeArrivee, String voiture, List<Trajet> trajets){
        super(nom, villeDepart, villeArrivee);
        this.voiture = voiture;
        this.trajets = new ArrayList<Trajet>();
    }
    

    public void afficherProfil(){
        System.out.println("Conducteur : " + this.getNom().toString() + " | Véhicule : " + voiture + ".\n");//trajets.get(0).toString()); 
    }

    public void ajouterTrajet(Trajet trajet){
        this.trajets.add(trajet);
    }

    public int calculerDistanceTotale(){
        return 0;
    }
    
    // Gets & Sets
    public String getVoiture() {
        return voiture;
    }

    public void setVoiture(String voiture) {
        this.voiture = voiture;
    }

    public List<Trajet> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<Trajet> trajets) {
        this.trajets = trajets;
    }

}
