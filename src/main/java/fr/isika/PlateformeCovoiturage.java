package fr.isika;

import java.util.ArrayList;
import java.util.List;

public class PlateformeCovoiturage {
    private List<Utilisateur> utilisateurs;
    private List<Trajet> trajets;

    public PlateformeCovoiturage(){
        this.utilisateurs = new ArrayList<Utilisateur>();
        this.trajets = new ArrayList<Trajet>();
    }
    public PlateformeCovoiturage(List<Utilisateur> utilisateurs, List<Trajet> trajets){
        this.utilisateurs = new ArrayList<Utilisateur>();
        this.trajets = new ArrayList<Trajet>();
    }
}
