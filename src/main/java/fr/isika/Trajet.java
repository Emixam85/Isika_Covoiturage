package fr.isika;

import java.util.List;

public class Trajet {
    /**
* @param depart est la String représentant le nom de la ville de départ
* @param arrivee est la String représentant le nom de la ville d'arrivee
* @param distance est l'entier représentant la distance à parcourir
* @param dureeEstimee est l'entier représentant la durée estimée en heure du trajet
* @param conducteur est la variable de type Conducteur représentant la conducteur du trajet
* @param passagers est la liste de passagers prévu sur le trajet (liste de type Passager)
*/
    String depart;
    String arrivee;
    int distance;
    int dureeEstimee;
    Conducteur conducteur;
    List<Passager> passagers;

    public Trajet(String depart, String arrivee, int distance,
    int dureeEstimee,  Conducteur conducteur){//, List<Passager> passagers){
        this.depart = depart;
        this.arrivee = arrivee;
        this.distance = distance;
        this.dureeEstimee = dureeEstimee;
        this.conducteur = conducteur;
       // this.passagers<>;
    }
/**
 * Methode permettant l'ajout de passager
 */
    public void ajouterPassager(Passager p){
        passagers.add(p);
    }

    public int calculerVitesseMoyenne(){
        return this.distance/this.dureeEstimee;
    }
}
