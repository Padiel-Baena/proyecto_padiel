package tema6.POO3.Ejercicio8;

public class AtaqueEspadazo implements IAtaqueAvanzado{

    protected int vida;
    protected  int energia;
    protected  int danio;
    protected int defensaEnemigo;

    protected final int VIDA_DEFECTO = 100;
    protected final int ENERGIA_DEFECTO = 100;
    protected final int DANIO_DEFECTO = 100;
    protected final int DEFENSA_ENEMIGO_DEFECTO = 100;

    public AtaqueEspadazo(){
        this.vida = VIDA_DEFECTO;
        this.energia = ENERGIA_DEFECTO;
        this.danio = DANIO_DEFECTO;
        this.defensaEnemigo = DEFENSA_ENEMIGO_DEFECTO;
    }
    public AtaqueEspadazo(int vida, int energia, int Danio, int defensaEnemigo){
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
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }



    @Override
    public void Lanzar() {
        System.out.println("Lanzando Espadazo");
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
