package com.examen1;

import java.util.ArrayList;

public class pre05 

{
    public static void main( String[] args )
    {

        Producto elementoMantequilla = new Producto();// objeto vacio
        elementoMantequilla.set_nombre("Mantequilla");// objeto tiene prod_nombre -> Manteiquilla
        elementoMantequilla.set_id(10);
        elementoMantequilla.set_precio(2.5f);
        elementoMantequilla.set_marca("laive");


        Producto elementoQueso = new Producto();
        elementoQueso.set_nombre("Queso") ;
        elementoQueso.set_id (11) ;
        elementoQueso.set_precio(10f) ;
        elementoQueso.set_marca("laive") ;

        Producto elementozanahoria = new Producto();
        elementozanahoria.set_nombre("zanahoria") ;
        elementozanahoria.set_id(13) ;
        elementozanahoria.set_precio(2f);
        elementozanahoria.set_marca("arequipeña");
        
        Producto elementopapas = new Producto();
        elementopapas.set_nombre("papas") ;
        elementopapas.set_id(14) ;
        elementopapas.set_precio(2f) ;
        elementopapas.set_marca("lays") ;

        
        


        // Producto[] listaDeProductos;
        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>(); // Lista vaciaa

        

        

        // C -> Crear    -> agregar
        listaDeProductos.add(elementoQueso);
        listaDeProductos.add(elementoMantequilla);  // lista con elementoMantequilla // hay un elemento
        listaDeProductos.add(elementozanahoria);
        listaDeProductos.add(elementopapas);

        // R -> Read     -> leer
        for(int i = 0; i< listaDeProductos.size(); i++) {
            System.out.println(   listaDeProductos.get(i).get_id() + " -> "+ listaDeProductos.get(i).get_nombre()+ " : "+ listaDeProductos.get(i).get_precio()+ " - "+ listaDeProductos.get(i).get_marca()); // listaDeProductos[i]
        }
        System.out.println("\n\n");
        
        
        // U -> Update   -> actualizar

        int idActualizar = 10;
        String nuevoNombre = "salchichas";

        for(int i = 0; i< listaDeProductos.size(); i++) {
            if ( listaDeProductos.get(i).get_id() == idActualizar  ) { // encontrando el elemento para actualizar
                // update
                listaDeProductos.get(i).set_nombre(nuevoNombre); // modificando el nombre del elemento encontrado
            }
        }


        // R -> Read     -> leer
        for(int i = 0; i< listaDeProductos.size(); i++) {
            System.out.println(   listaDeProductos.get(i).get_id() + " -> "+ listaDeProductos.get(i).get_nombre()+ " : "+ listaDeProductos.get(i).get_precio()+ " - "+ listaDeProductos.get(i).get_marca()); // listaDeProductos[i]
        }
        System.out.println("\n\n");
        


        // D -> Delete   -> Eliminar

        int idEliminar = 14; 
        
        for(int i = 0; i< listaDeProductos.size(); i++) {
            if ( listaDeProductos.get(i).get_id() == idEliminar  ) { // encontrando posicion a eliminar -> i
            
                // delete
                listaDeProductos.remove(listaDeProductos.get(i)); // modificando el nombre del elemento encontrado
            }
        }

        // R -> Read     -> leer
        for(int i = 0; i< listaDeProductos.size(); i++) {
            System.out.println(   listaDeProductos.get(i).get_id() + " -> "+ listaDeProductos.get(i).get_nombre()+ " : "+ listaDeProductos.get(i).get_precio()+ " - "+ listaDeProductos.get(i).get_marca()); // listaDeProductos[i]
        }
        System.out.println("\n\n");

    }
    

}
