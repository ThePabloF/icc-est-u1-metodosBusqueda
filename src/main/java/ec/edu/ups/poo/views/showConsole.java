package ec.edu.ups.poo.views;

import java.util.Scanner;

import ec.edu.ups.poo.models.Persona;

public class ShowConsole {

    private Scanner sc = new Scanner(System.in);


    public void showMenu() {
        System.out.println("Metodo de Busqueda");
    }

    public Persona[] arregloPersona(int tam){

        Persona[] personas = new Persona[tam];
        for (int i = 0; i < tam; i++) {
            String name = getName();
            int edad = getEdad();
            personas[i] = new Persona(edad, name);
        }
        return personas;
    }

    public int getEdad(){
        System.out.println("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        while (edad <= 0) {
            System.out.println("EDAD NO VALIDA");
            System.out.println("Ingrese la edad de la persona: ");
            edad = sc.nextInt();
        }
        return edad;

        
        
    }
    public String getName(){

        System.out.println("Ingrese el nombre de la persona: ");
        String name = sc.next();
        System.out.println("Nombre Ingresado: "+ name);
        return name;
    }

    public void printPeopleList(Persona[] people) {
        for (Persona persona: people) {
            System.out.println(persona);
            
        }
    }

    public void menu(){
        System.out.println("Menu");
        System.out.println();
    }
    

    public void ShowMessage(String mensaje) {
        System.out.println(mensaje);
    }
}
