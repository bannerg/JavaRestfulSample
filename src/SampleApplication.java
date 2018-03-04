import pe.edu.utp.javarestfulsample.ProductsResource;
import pe.edu.utp.javarestfulsample.SamplesResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")    //Se expone el API
public class SampleApplication extends Application{ //Ctrl+o en la clase y seleccionamos getClasses
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(SamplesResource.class);
        h.add(ProductsResource.class);
        return h;
    }
}
