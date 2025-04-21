package ec.edu.ups.poo.controllers;

import ec.edu.ups.poo.views.ShowConsole;
import ec.edu.ups.poo.models.Persona;


public class MetodosBusqueda {
    private ShowConsole sConsole;
    private Persona[] people;


    public MetodosBusqueda( Persona[] people) {
        this.sConsole = new ShowConsole();
        this.people = people;
        showPersonByCode();
    }

    public ShowConsole getsConsole() {
        return sConsole;
    }

    public void setsConsole(ShowConsole sConsole) {
        this.sConsole = sConsole;
    }



    public int busquedaLineal(int[] arreglo, int n) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code) {
//        int cont = 0;
//        for (Persona personas : people){
//            if (personas.getCode() == code){
//
//                return cont;
//            }
//            cont++;
//        }
        for (int i = 0; i < people.length; i++) {
            if (people[i].getEdad() == code) {
                return i;
            }
        }
        return -1;
    }
    public void showPersonByCode() {
        int codeToFind = sConsole.getEdad();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            sConsole.ShowMessage("Persona Encontrada");
            sConsole.ShowMessage(people[indexPerson].toString());

        }else {
            sConsole.ShowMessage("Persona con codigo" + codeToFind + " no encontrada");
        }
    }
}
