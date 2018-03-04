package pe.edu.utp.javarestfulsample;

import pe.edu.utp.javarestfulsample.models.ProductsClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/products")
public class ProductsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductsClass> getSamples(){
        List<ProductsClass> products = new ArrayList<>();
        for (int i=0; i < 10; i++){
            products.add(new ProductsClass(i,"Product: "+i,100));
        }
        return products;
    }
}
