package tema6.POO3.Ejercicio7;

public class AtaqueFisico implements IAtaque{

    protected double vida;
    protected  double energia;
    protected  int danio;
    protected int defensaEnemigo;

    protected final double VIDA_DEFECTO = 100;
    protected final double ENERGIA_DEFECTO = 100;
    protected final int DANIO_DEFECTO = 100;
    protected final int DEFENSA_ENEMIGO_DEFECTO = 100;

    public AtaqueFisico(){
        this.vida = VIDA_DEFECTO;
        this.energia = ENERGIA_DEFECTO;
        this.danio = DANIO_DEFECTO;
        this.defensaEnemigo = DEFENSA_ENEMIGO_DEFECTO;
    }
    public AtaqueFisico(double vida, double Energia, int Danio, int defensaEnemigo){
        this.vida = vida;
        this.energia = energia;
        this.danio = danio;
        this.defensaEnemigo = defensaEnemigo;
    }

    public int getDanio() {
        return danio;
    }
    public void setDanio(int danio) {
        this.danio = danio;
    }
    public int getDefensaEnemigo() {
        return defensaEnemigo;
    }
    public void setDefensaEnemigo(int defensaEnemigo) {
        this.defensaEnemigo = defensaEnemigo;
    }
    public double getEnergia() {
        return energia;
    }
    public void setEnergia(int mana) {
        this.energia = energia;
    }
    public double getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }


    @Override
    public void Lanzar(){
        System.out.println("Lanzando ataque fisico");
    }
    @Override
    public double Coste() {
         double coste =this.energia - energia * 0.2;
        return coste;
    }
    @Override
    public double DanioInfligido() {
        double damage = Math.max(1,this.danio-this.defensaEnemigo);
        return damage;
    }
}
