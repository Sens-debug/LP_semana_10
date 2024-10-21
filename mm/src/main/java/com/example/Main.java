package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean x=true;
        int opcion;
       Scanner teclado= new Scanner(System.in);
       


     while(x){
     System.out.println("ingrese una opcion");

    opcion= teclado.nextInt();
        
    System.out.println("1-salir");


    switch (opcion) {
        case 1:
            System.out.println("salir del programa");
            x=false;
            break;
                   
    }
   }

}}