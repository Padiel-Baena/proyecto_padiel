package tema6.Ejercicio1;
//Crea una clase vehículo con los atributos comunes a turismos, camiones y
//ciclomotores. Para los turismos queremos saber el número de plazas y el tipo
//de uso (profesional o particular). Para los camiones el peso máximo
//autorizado y si la mercancía es peligrosa o no. Para ciclomotores la cilindrada
//y si necesita carnet (a partir de 125 cc necesita carnet). Necesita carnet NO es
//un atributo.
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String color;
    protected String matricula;
    protected int anio;

    protected String MARACA_DEFECTO = "Chevrolet";
    protected String MODELO_DEFECTO = "Camaro";
    protected String COLOR_DEFECTO = "Negro";
    protected String MATRICULO_DEFECTO = "1234-HBF";
    protected int ANIO_DEFECTO = 2018;
    public Vehiculo() {
        this.marca = MARACA_DEFECTO;
        this.modelo = MODELO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.matricula = MATRICULO_DEFECTO;
        this.anio = ANIO_DEFECTO;
    }
    public Vehiculo(String marca, String modelo, String color, String matricula,  int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void arrancar(){
        if(getAnio() <= 2000){
            System.out.println("El coche no arranca");
        }else{
            System.out.println("El coche ha arrancado");
        }
    }
    public String toString(){
        String frase = "----------------------------------------------------------------------------------------";
              frase += "\n| Marca : " + getMarca() + " | Modelo : " + getModelo() + " | Color : " + getColor() + " | Matricula : " + getMatricula() + " | Año : " + getAnio() + " |";
              frase += "\n--------------------------------------------------------------------------------------";
              return frase;
    }
}