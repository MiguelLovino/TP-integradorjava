import com.sun.jdi.connect.Connector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
public class Resultado{
    public Resultado(String arch) throws IOException
    {
        this.Sarch = arch;
        this.resul = Paths.get((String) Sarch);
        this.tabla_resultado = (ArrayList<String>) Files.readAllLines(resul);
        this.total_tabla = tabla_resultado.size();

    };
    public String Sarch; // = "archivos/resultado.csv";
    public Path resul; // = Paths.get((String) Sarch); //tomar como argumento args[0]
    protected ArrayList<String> tabla_resultado; //= //buscar otra forma
    protected int total_tabla; //=  //para dividir y sacar las rondas, (sin uso por el moento, a controlar)
    public ArrayList<String> get_resul()
    {
        return tabla_resultado;
    }
    public int get_total_tabla() //(sin uso por el moento, a controlar)
    {
        return total_tabla;
    }
}
