import java.io.IOException;
import java.util.ArrayList;

public class Rondas {
    public Rondas(String arch) throws IOException
    {
        ro = new Resultado(arch);
       //dividir_rondas();
        this.Rondas_a_dividir = ro.get_resul();
        dividir_rondas();
    };

    public Resultado ro;
    public ArrayList<String>Rondas_a_dividir;
    //obtengo todas las rondas para dividir
    protected ArrayList<String[]> Rondas_dividads = new ArrayList<String[]>(); //cada ronda queda almacenada en su index(previamente dividida(Rondas a dividir))
    protected String[] str = new String[2];
    protected int salto_de_ronda = 0;
    protected int str_index = 0;

    public void dividir_rondas()
    {
        for (int i = 0; i < Rondas_a_dividir.size(); i++)
        {
            str[str_index] = Rondas_a_dividir.get(i);
            str_index++;
            if (str_index == 2)
            {
                str_index = 0; //reseteo el index
                Rondas_dividads.add(salto_de_ronda, str.clone()); //al llegar a 3, ingreso el string[] con sus elementos
                salto_de_ronda ++; //sumo 1, para cambiar al index siguiente.
            }
        }
    }
    public ArrayList<String[]> get_rondas_divididas ()
    {
        return Rondas_dividads;
    }
}
