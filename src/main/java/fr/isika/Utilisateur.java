package fr.isika;
/**
 * Cette classe abstraite represente les Utilisateurs
 * et sert de squellette pour constituer les classes
 * d'utilisateurs tels que Conducteur et Passager
 */
public abstract class Utilisateur {
/**
* @param nom est la String représentant le nom de l'utilisateur
* @param villeDepart est la String représentant la vile de depart
* @param villeArrivee est la String représentant la vile d'arrivee
*/
    private String nom;
    private String villeDepart;
    private String villeArrivee;

    public Utilisateur(String nom, String villeDepart, String villeArrivee){
        this.nom = nom;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
    }

    public String afficherProfil(){
        return nom + "\t Départ : " + villeDepart + "\tArrivée : " + villeArrivee; 
    }

}
