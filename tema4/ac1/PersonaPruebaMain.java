package tema4;

public class PersonaPruebaMain {
    public static void main(String[] args) {


        PersonaPrueba persona1 = new PersonaPrueba();

        persona1.nombre = "Ana";
        persona1.edad = 35;
        persona1.saludar();
        persona1.presentarme();
        persona1.saludarA("Ximo");
        persona1.showInfo();
    }
}
