package fr.isika;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        //PlateformeCovoiturage();
        //Passager.getName()
        System.out.println( "************ Hello Covoiturage ! ***********" );

        Conducteur conduc1 = new Conducteur("Speddy Gonzales", "Paris" , "Marseille", "Bugatti Verone" );
        Trajet parisMarseille = new Trajet("Paris", "Marseille" , 773, 463, conduc1);//, passag1)
        conduc1.ajouterTrajet(parisMarseille);
        Trajet marseilleParis = new Trajet("Marseille", "Paris" , 773, 463, conduc1);//, passag1)
        conduc1.ajouterTrajet(marseilleParis);
        
        Conducteur conduc2 = new Conducteur("Joe Letaxi", "Lille" , "Perpignan", "Bugatti Verone" );
        Trajet lillePerpignan = new Trajet("Lille", "Perpignan" , 1095, (14*60)+7, conduc2);//, passag1)
        conduc2.ajouterTrajet(lillePerpignan);
        Trajet perpignanLille = new Trajet("Perpignan", "Lille" , 1095, (14*60)+7, conduc2);//, passag1)
        conduc2.ajouterTrajet(perpignanLille);
        
        conduc1.afficherProfil();
        conduc2.afficherProfil();

        Passager passag1 = new Passager("Alfred", "Paris", "Marseille", "Marseille");
        
        parisMarseille.ajouterPassager(passag1);
       
        passag1.suivreTrajet(parisMarseille);
        //PlateformeCovoiturage.collectTrajet(parisMarseille);
        passag1.suivreTrajet(lillePerpignan);
        parisMarseille.toString();
        passag1.afficherProfil();
    }
}
