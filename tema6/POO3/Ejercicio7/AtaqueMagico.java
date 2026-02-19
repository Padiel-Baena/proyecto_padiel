package tema6.POO3.Ejercicio7;

public class AtaqueMagico implements IAtaque{

    protected int vida;
    protected  int mana;
    protected  int danio;
    protected int defensaEnemigo;

    protected final int VIDA_DEFECTO = 100;
    protected final int MANA_DEFECTO = 100;
    protected final int DANIO_DEFECTO = 100;
    protected final int DEFENSA_ENEMIGO_DEFECTO = 100;

    public AtaqueMagico(){
        this.vida = VIDA_DEFECTO;
        this.mana = MANA_DEFECTO;
        this.danio = DANIO_DEFECTO;
        this.defensaEnemigo = DEFENSA_ENEMIGO_DEFECTO;
    }
    public AtaqueMagico(int vida, int mana, int Danio, int defensaEnemigo){
        this.vida = vida;
        this.mana = mana;
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
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void Lanzar(){
        System.out.println("Lanzando ataque magico");
    }
    @Override
    public double Coste() {
        double coste =this.mana * 0.2;
        return coste;
    }
    @Override
    public double DanioInfligido() {
        double damage = Math.max(1,this.danio-this.defensaEnemigo);
        return damage;
    }
}
