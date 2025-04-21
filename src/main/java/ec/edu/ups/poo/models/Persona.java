package ec.edu.ups.poo.models;

public class Persona {

    private int edad;
    private String name;

    public Persona(int edad, String name) {
        this.edad = edad;
        this.name = name;
    }
    
    public Persona() {
    }

    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "edad: " + edad +
                ", name: '" + name + '\'' +
                '}';
    }



    
}
