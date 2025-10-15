package by.nickzh.dao;

import by.nickzh.entity.Product;

public class ProductDao {
    private final static ProductDao INSTANCE = new ProductDao();

    public static ProductDao getInstance() {
        return INSTANCE;
    }

    public Product save(Product product) {

    }

    private ProductDao() {
    }
}
