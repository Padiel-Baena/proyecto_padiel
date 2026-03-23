package tema7.Ejercicios1.NotasAlumnos;

public class Alumnos implements Comparable<Alumnos>{
    private String nombre;
    private int[] notas;

    public Alumnos(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double media(){
        double media = 0;
        int cont =0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
             cont ++;
        }
        media /= cont;
        return media;
    }

    public String toString(){
        return nombre + " Tiene de media : " + media();
    }

    @Override
    public int compareTo(Alumnos otro) {
        return Double.compare(otro.media(), this.media());
    }
}
