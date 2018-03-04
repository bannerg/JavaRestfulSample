package pe.edu.utp.javarestfulsample.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductsEntity {
    private  static List<Product> products; //Static por ser coleccion de memoria

    public List<Product> getProducts(){
        if (products == null){
            products = new ArrayList<>();
            for (int i= 1; i < 11; i++){
                int stock = (int) (Math.random()*100)+1;
                products.add(new Product(i,"Product: "+i, stock));
            }
        }
        return products;
    }

    public List<Product> findAll(){
        return getProducts();
    }

    public Product findById(int id){
        for (Product product : getProducts()){
            if (product.getId() == id) return product;
        }
        return null;
    }

    public Product findByName(String name){
        for (Product product : getProducts()){
            if (product.getName() == name) return product;
        }
        return null;
    }

    public boolean deleteById(int id){
        for (int i = 0; i < getProducts().size(); i++){
            if (getProducts().get(i).getId() == id){
                getProducts().remove(i);
                return true;
            }
        }
        return false;
    }

    public Product create(Product product){
        if (findById(product.getId()) != null) return null;
        if (findByName(product.getName()) != null) return null;
        getProducts().add(product);
        return product;
    }

    public Product create(int id, String name, int stock){
        return create(new Product(id, name, stock));
    }

    public Product update(Product product){
        if (findById(product.getId()) == null) return null;
        for (int i = 0; i < getProducts().size(); i++){
            if (getProducts().get(i).getId() == product.getId()){
                getProducts().get(i).setName(product.getName());
                getProducts().get(i).setStock(product.getStock());
                return getProducts().get(i);
            }
        }
        return null;
    }
}
