package tema5.Colecciones1.banco;

public class UsuarioBanco {
    private String dni;
    String nombre;
    int edad;


    String DNI_DEFECTO = "11111111A";
    String NOMBRE_DEFECTO = "Pabit";
    int EDAD_DEFECTO = 23;

    public UsuarioBanco(){
        this.dni = DNI_DEFECTO;
        this.nombre = NOMBRE_DEFECTO;
        this.edad = EDAD_DEFECTO;
    }
    public UsuarioBanco(String dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad > 0 && edad <= 99) {
            this.edad = edad;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
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
