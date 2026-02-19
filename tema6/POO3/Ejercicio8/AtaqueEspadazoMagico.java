package tema6.POO3.Ejercicio8;

public class AtaqueEspadazoMagico implements IAtaqueAvanzado {

    protected int vida;
    protected  int mana;
    protected  int danio;
    protected int defensaEnemigo;
    protected  int energia;


    protected final int VIDA_DEFECTO = 100;
    protected final int MANA_DEFECTO = 100;
    protected final int DANIO_DEFECTO = 100;
    protected final int DEFENSA_ENEMIGO_DEFECTO = 100;
    protected final int ENERGIA_DEFECTO = 100;


    public AtaqueEspadazoMagico(){
        this.vida = VIDA_DEFECTO;
        this.mana = MANA_DEFECTO;
        this.danio = DANIO_DEFECTO;
        this.defensaEnemigo = DEFENSA_ENEMIGO_DEFECTO;
        this.energia = ENERGIA_DEFECTO;
    }
    public AtaqueEspadazoMagico(int vida, int mana, int Danio, int defensaEnemigo, int energia){
        this.vida = vida;
        this.mana = mana;
        this.danio = danio;
        this.defensaEnemigo = defensaEnemigo;
        this.energia = energia;
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
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }



    @Override
    public void Lanzar() {
        System.out.println("Lanzando espadazo magico");
    }
    @Override
    public double Coste(){
        double coste =this.energia - energia * 0.2;
        //despues lo dividiria y la mitad se le resta a energia y la otra a mana
        return coste;
    }
    @Override
    public double DanioInfligido() {
        double damage = Math.max(1,this.danio-this.defensaEnemigo);
        return damage;
    }
}
