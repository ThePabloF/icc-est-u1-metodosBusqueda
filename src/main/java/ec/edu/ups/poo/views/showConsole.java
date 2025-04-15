package ec.edu.ups.poo.views;

import java.util.Scanner;

public class showConsole {
    private Scanner sc = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Metodo de Busqueda");
    }
    public int getCode(){
        System.out.println("Ingrese el codigo del persona");
        int codigo = sc.nextInt();
        System.out.println("Codigo  ingresado: "+codigo);
        return codigo;
    }

    public void ShowMessage(String mensaje) {
        System.out.println(mensaje);
    }
}
