package products;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alice on 28/09/2015.
 */
public final class ProductFactory {

    private static final ProductFactory instance = new ProductFactory();
    private static Map<String, Products> registry = new HashMap<String, Products>();

    public static ProductFactory getInstance() {
        return instance;
    }

    public static void registerProduct(String name, Products p) {
        registry.put(name, p);
    }

    public Product createProduct(String name) {
        return registry.get(name).createProduct();
    }
}
