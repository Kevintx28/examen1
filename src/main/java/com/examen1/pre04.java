package com.examen1;
import java.util.Arrays;
import java.util.Collections;

class pre04 {
  public static void main(String args[]) {

    Integer[] calificaciones = {11, 12 , 13, 18, 11, 9, 20, 19};
    
    int sumas = 0;

    
    // convirtiendo array comun en collection para poder usar la funcion max
    int max = Collections.max( Arrays.asList(calificaciones) ); 
    // convirtiendo array comun en collection para poder usar la funcion min
    int min = Collections.min( Arrays.asList(calificaciones) );
    
    

    for(int i = 0; i < calificaciones.length; i++) {
      sumas = sumas + calificaciones[i]; 
    }

    int promedio = sumas/calificaciones.length;

    System.out.println("Promedio de las calificaciones: "+ promedio);
    System.out.println("Mayor calificacion: "+ max);
    System.out.println("Menor calificacion: "+ min);
  }
}