package products;

import products.Product;

/**
 * Created by Alice on 28/09/2015.
 */
public abstract class Products implements Product {
    public void doSomething(){};

    @Override
    public String toString() {
        return this.getClass().getCanonicalName();
    }
}
