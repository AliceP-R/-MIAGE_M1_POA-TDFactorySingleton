import products.Product;
import products.ProductFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {

    static
    {
        /* sans fichier .properties
        try
        {
            Class.forName("products.ProductA");
            Class.forName("products.ProductB");
        }
        catch ( ClassNotFoundException any ) {
            any.printStackTrace() ;
        }
        */
        /* avec fichier .properties */
        Properties prop = new Properties();
        FileInputStream in;
        try {
            // Ouverture et chargement du fichier .properties
            in = new FileInputStream(".properties");
            prop.load(in);
            in.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e.toString());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e.toString());
        }

        // Lecture du contenu
        Set<String> contenu = prop.stringPropertyNames();
        Iterator<String> it = contenu.iterator();

        // Pour chaque ligne, on charge la classe
        while(it.hasNext())
        {
            try {
                Class.forName(prop.getProperty(it.next()));
            } catch (ClassNotFoundException e) {
                // e.printStackTrace();
                System.out.println(e.toString()); 
            }
        }
    }
    public static void main ( String [] args ) {

        ProductFactory instance = ProductFactory.getInstance();
        Product p1 = instance.createProduct("ProductA");
        System.out.println(p1);
        p1.doSomething();

    }
}
