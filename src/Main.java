import products.Product;
import products.ProductFactory;

public class Main {

    static
    {
        try
        {
            Class.forName("products.ProductA");
            Class.forName("products.ProductB");
        }
        catch ( ClassNotFoundException any ) {
            any.printStackTrace() ;
        }
    }
    public static void main ( String [] args ) {

        ProductFactory instance = ProductFactory.getInstance();
        Product p1 = instance.createProduct("ProductA");
        System.out.println(p1);
        p1.doSomething();

    }

}
