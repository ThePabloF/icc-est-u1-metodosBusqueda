package ec.edu.ups.poo.controllers;

import ec.edu.ups.poo.views.showConsole;
import ec.edu.ups.poo.models.Persona;


public class metodosBusqueda {
    private showConsole sConsole;
    private Persona[] people;


    public metodosBusqueda( Persona[] people) {
        this.sConsole = new showConsole();
        this.people = people;
        showPersonByCode();
    }

    public showConsole getsConsole() {
        return sConsole;
    }

    public void setsConsole(showConsole sConsole) {
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
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    public void showPersonByCode() {
        int codeToFind = sConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            sConsole.ShowMessage("Persona Encontrada");
            sConsole.ShowMessage(people[indexPerson].toString());

        }else {
            sConsole.ShowMessage("Persona con codigo" + codeToFind + " no encontrada");
        }
    }
}
