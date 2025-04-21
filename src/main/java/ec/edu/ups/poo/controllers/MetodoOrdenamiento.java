package ec.edu.ups.poo.controllers;

import ec.edu.ups.poo.models.Persona;

public class MetodoOrdenamiento {
    private Persona[] persona;

    public MetodoOrdenamiento(Persona[] personas){
        this.persona = personas;
    }
    public MetodoOrdenamiento(){

    }
    
    public void shellSort(Persona[] personas) {
        int n = personas.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Persona temp = personas[i]; 
                int j;
                
                for (j = i; j >= gap && personas[j - gap].getEdad() > temp.getEdad(); j -= gap) {
                    personas[j] = personas[j - gap];
                }
                personas[j] = temp; 
            }
        }
    }
    
    
    
    
}
    
