package pe.edu.utp.javarestfulsample;

import pe.edu.utp.javarestfulsample.models.JaxService;
import pe.edu.utp.javarestfulsample.models.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
public class ProductsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getSamples(){
        JaxService jaxService = new JaxService();
        List<Product> products = jaxService.findAllProdcuts();

        return products;
    }
}
