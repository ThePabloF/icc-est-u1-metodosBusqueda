package ec.edu.ups.poo.controllers;

import ec.edu.ups.poo.models.Persona;
import ec.edu.ups.poo.views.ShowConsole;

public class MetodoBusquedaBinaria {
    private Persona[] people;
    private ShowConsole vista;

    public MetodoBusquedaBinaria(Persona[] people){
        this.vista = new ShowConsole();
        this.people = people;

        vista.ShowMessage("Metodos de Busqueda Binaria");
    }
    
    private int findPersonByEdad (int edad){
        int bajo = 0;
        int alto = people.length-1;

        while (bajo<= alto) {
            int central = bajo+(alto-bajo)/2;
            if (people[central].getEdad() == edad ) {
                System.out.println(people[central].getEdad());
                System.out.println("bajo: "+ bajo + " alto: "+ alto + " centro: "+ central + " Valor Centro: "+ people[central].getEdad()+ "--> Encontrado");
                return central;
            }
            if (people[central].getEdad() < edad) {
                for (int i = central+1; i < alto+1; i++) {
                    System.out.print(people[i].getEdad() + " /");
                }
                System.out.println("");
                System.out.println("bajo: "+ bajo + " alto: "+ alto + " centro: "+ central + " Valor Centro: "+ people[central].getEdad()+ "--> Derecha");
                bajo = central+1;
            }else{
                for (int i = bajo; i < central-1; i++) {
                    System.out.print(people[i].getEdad() + " /");
                }
                System.out.println("");
                System.out.println("bajo: "+ bajo + " alto: "+ alto + " centro: "+ central + " Valor Centro: "+ people[central].getEdad()+ "--> Izquierda");
                alto= central-1;
            }
            
        }

        return -1;
    }

    public void showPersonByEdad(){
       int edadToFind = vista.getEdad();
       int indexPerson = findPersonByEdad(edadToFind);
       if (indexPerson == -1) {
        vista.ShowMessage("NO hay la persona con esa edad");

       }else{
        vista.ShowMessage("Persona con Edad: "+ edadToFind+" encontrada");
        vista.ShowMessage(people[indexPerson].toString());
       }
    }
    
    private int findPersonByName(){

        return -1;
              }
    
}
