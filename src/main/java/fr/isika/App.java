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
        conduc1.afficherProfil();
    }
}
