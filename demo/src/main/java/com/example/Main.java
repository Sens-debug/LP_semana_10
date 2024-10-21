package com.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String []nombresProductos = {"Pepsi","CocaCola","Agua","Milo"};
        double []preciosProductos= {2.5, 2.7, 1.2, 5.0};
        int []cantidadProductos= {4, 3, 7, 5};
        boolean centinelaWhile=true;
        while (centinelaWhile) {
            Scanner teclado = new Scanner(System.in);
            mostrarMenu(nombresProductos, preciosProductos, cantidadProductos);
            System.out.println("ingrese el producto deseado, puede parar la interfaz escribiendo 'FIN'");
            String productoDeseado = teclado.nextLine();
            if (productoDeseado.equalsIgnoreCase("FIN")) {centinelaWhile=false;break;}
            int indice = seleccionarProducto(nombresProductos, productoDeseado);
            if(indice!=-1){
                System.out.println("Ingrese el dinero");
            double cantidadDinero= teclado.nextDouble();
            if(verificarPago(indice, cantidadDinero, preciosProductos)){
                entregarProducto(indice, cantidadProductos,nombresProductos);
                double cambio = calcularCambio(cantidadDinero, seleccionarProducto(nombresProductos, productoDeseado), preciosProductos);
                System.out.println("CAMBIO -> "+cambio);
            } else{System.out.println("PAGO INSUFICIENTE");}}
            else{System.out.println("Articulo no existe");}


            
            
        }
   
   
    }



public static void mostrarMenu(String[]nombresProductos,double[]preciosProductos,int[]cantidadProductos){
    for(int i=0;i<nombresProductos.length;i++){
System.out.println("El producto -> "+nombresProductos[i]+" tiene un costo de -> "+preciosProductos[i]+"--EXISTENCIAS -> "+cantidadProductos[i]+"\n");}
}

public static int seleccionarProducto(String[] nombresProductos, String nombreProducto){
    for (int i = 0; i < nombresProductos.length;i++) {
if (nombresProductos[i].equalsIgnoreCase(nombreProducto)) {
return i;
}}
return-1;
}

public static boolean verificarPago(int indiceProducto,double cantidadDinero, double[]preciosProductos) {
double precioProducto = preciosProductos[indiceProducto];
if (cantidadDinero>=precioProducto) {return true;}
else {System.out.println("No cuentas con el dinero suficiente para pagar el plato"); return false;}
    
}

public static double calcularCambio(double cantidadDinero, int indiceProducto, double[]preciosProductos) {
    double cambio = (preciosProductos[indiceProducto])-cantidadDinero; 
    return cambio;
    
}

public static void entregarProducto(int indiceProducto, int[]cantidadProductos, String[]nombresProductos){
    int cantidadProducto= cantidadProductos[indiceProducto];
        if(cantidadProducto<=0){
            System.out.println("No hay cantidad en el stock");
        }else{System.out.println("El producto "+ nombresProductos[indiceProducto]+" ha sido entregado");            
                cantidadProductos[indiceProducto]-=1;}
    }

}






