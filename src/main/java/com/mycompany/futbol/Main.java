package com.mycompany.futbol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
               
        System.out.println("¡Bienvenido!");
        System.out.println("Ingrese la opción deseada para consultar los datos de los equipos.");
        System.out.println("1- Ver los datos de un equipo \n 2- Ver los datos de todos los equipos \n 3-salir");
        Scanner entrada = new Scanner(System.in);
        
        int opcion = entrada.nextInt();
        
        switch (opcion){
            case 1: 
                System.out.println("Ingrese el id del equipo");
                int id = entrada.nextInt();
                System.out.println("Usted ingresó el id: "+id);
                Equipo eq = new Equipo();
                eq.mostrarUnEquipo(id);
                
                break;
            case 2: 
                System.out.println("Datos de los equipos:");
                Equipo equipo = new Equipo();
                equipo.mostrarEquipos();
                
                
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
                
            default: 
                System.out.println("La opción elegida es incorrecta");
                      
        }
        
        
    }
}
