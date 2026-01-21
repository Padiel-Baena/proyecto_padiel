package tema4;

public class Reloj {
    int hora;
    int min;
    int seg;
    boolean formato24;

    public static final int horaDefecto = 00;
    public static final int minDefecto = 00;
    public static final int segDefecto = 00;
    public static final boolean formato24Defecto = false;

    public Reloj(){
        this.hora = horaDefecto;
        this.min = minDefecto;
        this.seg = segDefecto;
        this.formato24=formato24Defecto;
    }
    public Reloj(int hora, int min, int seg, boolean formato24){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        this.formato24=formato24;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if(hora > 0 && hora < 24){
        this.hora = hora;
    }
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        if (min > 0 && min < 60) {
            this.min = min;
        }
    }
    public int getSeg() {
        return seg;
    }
    public void setSeg(int seg) {
        if (seg > 0 && seg < 60) {
            this.seg = seg;
        }
    }
    public boolean isFormato24() {
        return formato24;
    }
    public void setFormato24(boolean formato24) {
        this.formato24 = formato24;
    }


    public void mostrarHora(int hora, int min, int seg, boolean formato24){
        if (formato24){
            System.out.println("La hora es " + hora + ":" + min + ":" + seg);
        }
        else{
            if(hora > 12) {
                hora = hora - 12;
                System.out.println("La hora es " + hora + ":" + min + ":" + seg + " pm");
            }
            else{
                System.out.println("La hora es " + hora + ":" + min + ":" + seg + " am");
            }
        }
    }
    public String toString(){
        if (formato24){
           return "La hora es " + hora + ":" + min + ":" + seg;
        }
        else{
            if(hora > 12) {
                hora = hora - 12;
                 return  "La hora es " + hora + ":" + min + ":" + seg + " pm";
            }
            else{
                return "La hora es " + hora + ":" + min + ":" + seg + " am";
            }
        }
    }
}
