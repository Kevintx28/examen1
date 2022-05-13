package com.examen1;
public class pre01 {

    public static void main(String[] args) { // clase principal
    
            //             0         1          2       3       4       5       6       7           8               9       10              11           12
      String[] meses = {"enero", "febrero", "marzo", "bril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      
      System.out.println("El primer mes del año es: "+ meses[0]);
      System.out.println("El ultimo mes del año es: "+ meses[11]);
      

      for(int i = 0 ; i <= 12; i++ ) { // ejecutando hasta que la condicion es no -> false

        System.out.println(meses[i]); // se ejecuta ->  la linea 7^
      }
      // continuamos
    



    }


    public void hola() {

    }
}