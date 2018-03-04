package pe.edu.utp.javarestfulsample.models;

import java.util.List;

public class JaxService {
    ProductsEntity productsEntity = new ProductsEntity();

    public ProductsEntity getProductsEntity(){
        if (productsEntity == null){
            productsEntity = new ProductsEntity();
        }
        return productsEntity;
    }

    public List<Product> findAllProdcuts(){
        return getProductsEntity().findAll();
    }

    public Product findProductById(int id){
        return getProductsEntity().findById(id);
    }
}
