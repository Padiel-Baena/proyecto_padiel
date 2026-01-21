package tema4;

public class Hero {
    private String name;
    private int level;
    private int ps;
    private int psMax;
    private int xp;
    private int atq;
    private int def;

    private static final String nameDefecto = "Conrad";
    private static final int levelDefecto = 30;
    private static final int psDefecto = 57;
    private static final int psMaxDefecto = 75;
    private static final int xpDefecto = 50000;
    private static final int atqDefecto = 75;
    private static final int defDefecto = 60;

    public Hero(){
        this.name = nameDefecto;
        this.level = levelDefecto;
        this.ps = psDefecto;
        this.psMax = psMaxDefecto;
        this.xp = xpDefecto;
        this.atq = atqDefecto;
        this.def = defDefecto;
    }
    public Hero(String name, int level, int ps, int psMax, int xp, int atq, int def){
        this.name = name;
        this.level = level;
        this.ps = ps;
        this.psMax = psMax;
        this.xp = xp;
        this.atq = atq;
        this.def = def;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getPs() {
        return ps;
    }
    public void setPs(int ps) {
        if (ps > 0){
        this.ps = ps;
        }else{
            this.ps = 0;
        }
    }
    public int getPsMax() {
        return psMax;
    }
    public void setPsMax(int psMax) {
        this.psMax = psMax;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getAtq() {
        return atq;
    }
    public void setAtq(int atq) {
        this.atq = atq;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }

    public int drinkPotion(int ps, int psMax){
        if(ps == psMax){
            System.out.println("No has podido berberte la pocion, tienes la vida al maximo");
        }else{
            ps += 10;
            if (ps > psMax){
                ps = psMax;
            }
            System.out.println("Te has tomado la pocion de forma exitosa");
        }
        return ps;
    }
    public int rest(int ps, int psMax){
        if(ps == psMax){
            System.out.println("No has podido descansar, tienes la vida al maximo");
        }else{
            ps += 50;
            if (ps > psMax){
                ps = psMax;
            }
            System.out.println("Despues de haber descansado te sientes como nuevo");
        }
        return ps;
    }
    public String toString(String name, int level, int ps, int psMax, int xp, int atq, int def){
        return "El nombre del personaje es " + name + "\nNivel:" + level + ps +"/" + psMax + " PS" + "\nExperiencia:" + xp + "Ataque: " + atq + "\nDefensa : " + def;
    }
    public void attack(Hero hero1){
        System.out.println(hero1.name + " tiene : " + hero1.getPs() + "/" + hero1.getPsMax() + " PS");
        int damage =Math.max(1,(this.atq-hero1.getDef())+10);
        hero1.setPs(hero1.getPs()-damage);
        System.out.println(this.name + " ha golpeado a " + hero1.name);
        this.xp += 10;
        System.out.println(this.name + " ha ganado 10 de experiencia");
    }
    public void levelUp(int xp, int level, int psMax, int ps, int atq, int def){
        if (xp >= 50){
            xp -=50;
            level += 1;
            ps +=5;
            psMax +=5;
            atq += 1;
            def += 1;
            System.out.println(this.name + " ha subido un nivel\nestadisticas mejoradas");
        }
        else{
            System.out.println(this.name + " no tiene suficiente experiencia para subir de nivel");
        }
    }
}