package tema6.POO3.Ejercicio8;
//Crea una interfaz AtaqueAvanzado con métodos como lanzar (lanza un
//ataque), coste (devuelve lo que cuesta un ataque tanto en maná como en
//esfuerzo físico) y daño infligido (devuelve el daño que infringe de tipo mágico
//y de tipo físico). Implementa las clases Ataque Bola Fuego, Ataque Espadazo y
//Ataque Espadazo Encantado
public interface IAtaqueAvanzado {
        void Lanzar();
        double Coste();
        double DanioInfligido();
}
