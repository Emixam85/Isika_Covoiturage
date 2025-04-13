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

    public void afficherProfil(){
        System.out.println( this.nom + "\t Départ : " + this.villeDepart + "\tArrivée : " + this.villeArrivee); 
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

}
