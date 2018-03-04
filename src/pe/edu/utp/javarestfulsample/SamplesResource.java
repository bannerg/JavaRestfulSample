package pe.edu.utp.javarestfulsample;

import pe.edu.utp.javarestfulsample.models.SampleClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/samples")       //Combierto la clase a un recurso RESTFUL | Estar expuesta en una ruta (EndPoint), verbo al que reacciona
public class SamplesResource {
    @GET    //Verbo de reaccion
    @Produces(MediaType.APPLICATION_JSON) //Archivo a producir para el restful service
    public List<SampleClass> getSamples(){
        List<SampleClass> samples = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            samples.add(new SampleClass("Jhon","Doe"));
        }
        return samples;
    }
}
