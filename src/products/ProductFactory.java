package products;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alice on 28/09/2015.
 */
public final class ProductFactory
{

    private static Map<String, Products> registry = new HashMap<>();
    /* instance sans utilisation du DP Singleton
     private static final ProductFactory instance = new ProductFactory();
    public static ProductFactory getInstance()
    {
        return instance;
    }
    */

    /* instance avec l'utilisation du DP Singleton */
    private static final class SingletonHolder {
        private static final ProductFactory INSTANCE = new ProductFactory();
    }
    public static ProductFactory getInstance ()
    {
        return SingletonHolder.INSTANCE ;
    }

    public static void registerProduct(String name, Products p) {
        registry.put(name, p);
    }

    public Product createProduct(String name) {
        return registry.get(name).createProduct();
    }
}
