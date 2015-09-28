package products;

/**
 * Created by Alice on 28/09/2015.
 */
public class ProductA extends Products {
    static
    {
        ProductFactory.registerProduct("ProductA", new ProductA());
    }


    @Override
    public Product createProduct()
    {

        return new ProductA();
    }

    @Override
    public void doSomething()
    {

        System.out.println("doSomething A");
    }

    @Override
    public String toString() {
        return "Je suis un ProductA";
    }
}
