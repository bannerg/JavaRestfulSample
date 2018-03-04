package pe.edu.utp.javarestfulsample.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductsEntity {
    List<Product> products;

    public List<Product> getProducts(){
        if (products == null){
            products = new ArrayList<>();
            for (int i=1; i < 11; i++){
                int stock = (int) (Math.random()*100)+1;
                products.add(new Product((i+1),"Product: "+i, stock));
            }
        }
        return products;
    }

    public List<Product> findAll(){
        return getProducts();
    }

    public Product findById(int id){
        for (Product product : products){
            if (product.getId() == id) return product;
        }
        return null;
    }
}
