import java.util.Arrays;
import java.util.Collections;

class pre02 {
  public static void main(String args[]) {
    
    Integer[] calificaciones = {11, 12 , 13, 18, 11, 9, 20, 19, 12, 16};
    int sum_total = 0;
    
    // convirtiendo array comun en collection para poder usar la funcion max
    int max = Collections.max( Arrays.asList(calificaciones) ); 
    // convirtiendo array comun en collection para poder usar la funcion min
    int min = Collections.min( Arrays.asList(calificaciones) );
    
    for(int i = 0; i < calificaciones.length; i++) {
      sum_total = sum_total + calificaciones[i];
    }
    
    System.out.println("Promedio de las calificaciones: "+ (sum_total/calificaciones.length));
    System.out.println("Mayor calificacion: "+ max);
    System.out.println("Menor calificacion: "+ min);
  }
}