package pe.edu.utp.javarestfulsample;

import pe.edu.utp.javarestfulsample.models.JaxService;
import pe.edu.utp.javarestfulsample.models.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;

@Path("/products")
public class ProductsResource {
    JaxService jaxService = new JaxService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getSamples(){
        return jaxService.findAllProdcuts();
    }

    @GET
    @Path("/{id}")      //Se pasa el parametro a utilizar
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductById(@PathParam("id") int id){
        return jaxService.findProductById(id);
    }

    @DELETE
    @Path("/{id}")
    public HashMap<String, String> deleteProduct(@PathParam("id") int id){
        HashMap<String, String> result = new HashMap<>();
        String status = jaxService.deleteProductById(id) ? "success" : "not found";
        result.put("status", status);
        return result;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Product createProduct(Product product){
        return jaxService.createProduct(product);
    }
}
