package ec.edu.ups.poo;

import java.util.Scanner;

import ec.edu.ups.poo.controllers.MetodoBusquedaBinaria;
import ec.edu.ups.poo.controllers.MetodoOrdenamiento;
import ec.edu.ups.poo.controllers.MetodosBusqueda;
import ec.edu.ups.poo.models.Persona;
import ec.edu.ups.poo.views.ShowConsole;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
    MetodoOrdenamiento mO = new MetodoOrdenamiento();
    ShowConsole vistaConsole = new ShowConsole();
    Scanner sc = new Scanner(System.in);
    
    
    
    System.out.println("¿Cuantas personas desea ingresar?");
    int tam = sc.nextInt();
    while (tam<=0) {
        System.out.println("Tamaño no valido");
        System.out.println("¿Cuantas personas desea ingresar?");
        tam = sc.nextInt();
    }
    
    Persona[] personas = new Persona[tam];
    personas= vistaConsole.arregloPersona(tam);
    mO.shellSort(personas);
    vistaConsole.printPeopleList(personas);
    MetodoBusquedaBinaria mB = new MetodoBusquedaBinaria(personas);
    mB.showPersonByEdad();
    
    

    




    }
}