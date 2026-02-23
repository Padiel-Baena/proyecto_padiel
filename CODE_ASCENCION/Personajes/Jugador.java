package CODE_ASCENCION.Personajes;

import java.lang.reflect.Array;
import java.util.ArrayList;

enum clase{Sombra, Acorazado, Transmutador}
public class Jugador extends Entidad{
    private String nombre;
    private double PS;
    private int atq;
    private int def;
    private int vel;
    private ArrayList inventario;

    public int atacar(){
        return 0;
    }
}
