import java.io.IOException;
import java.util.ArrayList;

public class Partidos {
    public Partidos(String archprono) throws IOException
    {
       this.ronditas = new Rondas(archprono);
        ronditas.dividir_rondas();
        for ( int i = 1; i <ronditas.get_rondas_divididas().size()+1; i++)
        {
            get__partido(i);
        }
    }
    private Rondas ronditas;
    private Repartir_puntaje mostrar_puntaje_total;
    private void mostrar_ronda (int ronda) //Metodo en el que se selecciona la ronda para mostrar por pantalla
    {
        int r_index = -1;
        int salto_de_ronda = 2;
        r_index += ronda;

        for (int i = r_index * 2; i < salto_de_ronda + (r_index *2); i++)
        {
            for (int j = 0; j <ronditas.get_rondas_divididas().get(r_index).length; j++)
            {
                System.out.println(ronditas.get_rondas_divididas().get(i)[j]);
            }
        }
    }
    public void mostrar_partido(int partido) // metodo que muestra por pantalla el partido y resultado, que se seleccione
    {
        int p_index = -1;
        p_index += partido;

        for (int i = 0; i < ronditas.get_rondas_divididas().get(p_index).length; i++)
        {
            System.out.println(ronditas.get_rondas_divididas().get(p_index)[i]);
        }
    }
    private ArrayList<String[]> quien_gana = new ArrayList<String[]>();
    public ArrayList<String> Resultado = new ArrayList<String>();
    public void get__partido(int partido) // metodo que muestra por pantalla el partido y resultado, que se seleccione
    {
        int p_index = -1;
        p_index += partido;

        for (int i = 0; i < ronditas.get_rondas_divididas().get(p_index).length; i++)
        {
            quien_gana.add(i,ronditas.get_rondas_divididas().get(p_index)[i].split(","));
        }
        if (quien_gana.get(1)[2].contains("x")) //gana equipo 1
        {
            //System.out.println("gana "+ quien_gana.get(0)[1]);
            Resultado.add(0,quien_gana.get(0)[1]);
        }
        if (quien_gana.get(1)[3].contains("x")) //empate
        {
            //System.out.println("los equipos " + quien_gana.get(0)[1] + "y " + quien_gana.get(0)[5] + " empataron");
            Resultado.add(0,"Empate");
        }
        if (quien_gana.get(1)[4].contains("x"))//gana equipo 2
        {
           //System.out.println("gano "+ quien_gana.get(0)[5]);
            Resultado.add(0,quien_gana.get(0)[5]);
        }
    }

    public ArrayList<String[]> get_partido()
    {
       return ronditas.get_rondas_divididas();
    }

}
