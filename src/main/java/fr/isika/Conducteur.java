/**
 * Cette classe represente la structure de chaque utilisateur de type conducteur
 */
package fr.isika;
/**
  * @param voiture représente le véhicule du conducteur
  * @param trajet représente les différents trajet(s) du conducteur
  */
import java.util.List;

public class Conducteur extends Utilisateur{
    private String voiture;
    private List trajet = new Trajet<>();


    public Conducteur(String nom, String villeDepart, String villeArrivee, String voiture){
        super(nom, villeDepart, villeArrivee);
        this.voiture = voiture;
        this.trajet = trajet;
    }
    

    public String afficherProfil(){
        return "Conducteur : " + super.toString() + " | Véhicule : " + voiture + "\n|==> Trajet(s) :" + trajet; 
    }

    public void ajouterTrajet(){

    }

    public int calculerDistanceTotale(){

    }

}
