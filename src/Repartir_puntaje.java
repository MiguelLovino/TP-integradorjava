public class Repartir_puntaje {
    public Repartir_puntaje()
    {

    }
    public int puntaje = 0;
    public void clacular_puntaje(Partidos jugador, Partidos res)
    {
        for (int i = 0; i < res.Resultado.size(); i++)
        {
            if (res.Resultado.get(i).equals(jugador.Resultado.get(i)))
            {
                puntaje++;
            }
        }
        System.out.println("La persona obtuvo " + puntaje + " puntos");
    }
}
