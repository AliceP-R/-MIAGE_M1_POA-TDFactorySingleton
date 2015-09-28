package products;

/**
 * Created by Alice on 28/09/2015.
 */
public class ProductB extends Products {
    static
    {
        ProductFactory.registerProduct("ProductB", new ProductB());
    }

    @Override
    public Product createProduct()
    {
        return new ProductB();
    }

    @Override
    public void doSomething()
    {
        System.out.println("doSomething B");
    }
}
