import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Partidos Resultados = new Partidos(args[0]);
        Partidos Pronostico_miguel = new Partidos(args[1]);
        Repartir_puntaje rep = new Repartir_puntaje();

        rep.clacular_puntaje(Pronostico_miguel, Resultados);


    }
}