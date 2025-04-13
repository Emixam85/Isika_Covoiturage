package fr.isika;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        //Passager.getName()
        System.out.println( "************ Hello Covoiturage ! ***********" );
    
        Conducteur conduc1 = new Conducteur("Speddy Gonzales", "Paris" , "Marseille", "Bugatti Verone" );
        
        Trajet ParisMarseille = new Trajet("Paris", "Marseille" , 773, 463, conduc1);//, passag1)
         
        Passager passag1 = new Passager("Alfred", "Paris", "Marseille", "Marseille");
        
        passag1.suivreTrajet(ParisMarseille);
        
        conduc1.afficherProfil();
    }
}
