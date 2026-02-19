package tema6.POO3.Ejercicio7;
//Crea una interfaz Ataque con métodos como lanzar (lanza un ataque), coste
//(devuelve lo que cuesta un ataque) y daño infligido (devuelve el daño que
//infringe). Implementa las clases Ataque Mágico, Ataque Físico y Ataque
//Mágico y Físico.
public interface IAtaque {
    void Lanzar();
    double Coste();
    double DanioInfligido();
}
