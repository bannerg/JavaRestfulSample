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

    public Product findProductByName(String name){
        return getProductsEntity().findByName(name);
    }

    public boolean deleteProductById(int id){
        return getProductsEntity().deleteById(id);
    }

    public Product createProduct(Product product){
        return getProductsEntity().create(product);
    }

    public Product updateProdct(Product product){
        return getProductsEntity().update(product);
    }


}
