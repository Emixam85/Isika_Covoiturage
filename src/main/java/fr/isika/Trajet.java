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
    
    public Trajet(String depart, String arrivee, int distance, int dureeEstimee, Conducteur conducteur,
        List<Passager> passagers) {
    this.depart = depart;
    this.arrivee = arrivee;
    this.distance = distance;
    this.dureeEstimee = dureeEstimee;
    this.conducteur = conducteur;
    this.passagers = passagers;
}
/**
 * Methode permettant l'ajout de passager ssi il n'existe pas déjà dans la liste des passagers
 */
    public void ajouterPassager(Passager p){
        if (passagers != null){
            for (Passager passager : passagers) {
                if (passager == p)
                {
                    System.out.println("L'utilisateur "+p+" existe déjà dans le système.");
                    break;
                }
                else{
                    passagers.add(p);
                }
            }
        }
        
    }

    
    public int calculerVitesseMoyenne(){
        return this.distance/this.dureeEstimee;
    }

    public boolean estLong(){
        if(this.distance <= 300){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean estRapide(){
        if (this.calculerVitesseMoyenne() <= 100){
            return false;
        }
        else{
            return true;
        }
    } 

 // Gets & Sets
    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(int dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public List<Passager> getPassagers() {
        return passagers;
    }

    public void setPassagers(List<Passager> passagers) {
        this.passagers = passagers;
    }
    
}
