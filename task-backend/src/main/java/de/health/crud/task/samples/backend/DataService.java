package de.health.crud.task.samples.backend;

import java.io.Serializable;
import java.util.Collection;

import de.health.crud.task.samples.backend.data.Category;
import de.health.crud.task.samples.backend.data.Product;
import de.health.crud.task.samples.backend.mock.MockDataService;

/**
 * Back-end service interface for retrieving and updating product data.
 */
public abstract class DataService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public abstract Collection<Product> getAllProducts();

    public abstract Collection<Category> getAllCategories();

    public abstract void updateProduct(Product p);

    public abstract void deleteProduct(int productId);

    public abstract Product getProductById(int productId);

    public static DataService get() {
        return MockDataService.getInstance();
    }

}
