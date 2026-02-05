package tema5.gym;

public class Usuario {
private String nombre ;
private int edad;
private String dni;

private static final String NOMBRE_DEFECTO = "Diepla";
private int EDAD_DEFECTO = 15;
private String DNI_DEFECTO = "11111111A";

public Usuario(){
    this.nombre = NOMBRE_DEFECTO;
    this.edad = EDAD_DEFECTO;
    this.dni = DNI_DEFECTO;
}
public Usuario(String nombre){
    this.nombre = nombre;
}
public Usuario(String nombre, int edad, String dni){
    this.nombre=nombre;
    this.edad=edad;
    this.dni=dni;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString(){
        return "Nombre : " + this.nombre + " || Edad : " + this.edad + " || DNI : " + this.dni;
    }
    public static String checkDni(int dni) {
        int resto = dni % 23;
        String letra = Integer.toString(dni);
        switch (resto) {
            case 0:
                letra += "T";
                break;
            case 1:
                letra += "R";
                break;
            case 2:
                letra += "W";
                break;
            case 3:
                letra += "A";
                break;
            case 4:
                letra += "G";
                break;
            case 5:
                letra += "M";
                break;
            case 6:
                letra += "Y";
                break;
            case 7:
                letra += "F";
                break;
            case 8:
                letra += "P";
                break;
            case 9:
                letra += "D";
                break;
            case 10:
                letra += "X";
                break;
            case 11:
                letra += "B";
                break;
            case 12:
                letra += "N";
                break;
            case 13:
                letra += "J";
                break;
            case 14:
                letra += "Z";
                break;
            case 15:
                letra += "S";
                break;
            case 16:
                letra += "Q";
                break;
            case 17:
                letra += "V";
                break;
            case 18:
                letra += "H";
                break;
            case 19:
                letra += "L";
                break;
            case 20:
                letra += "C";
                break;
            case 21:
                letra += "K";
                break;
            case 22:
                letra += "E";
                break;
        }
        return letra;
    }
}
