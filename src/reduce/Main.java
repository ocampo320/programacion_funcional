package reduce;

import javax.net.ssl.SSLContext;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /**
         * reduce.
         * una coleccion devalores y queramos generar un unico
         * resultado
         * reduce los elementos de una coleccion
         * es como un acomulador
         */

        //suma de los elemntos de la coleccion
        //elementos:es un elemnto de la coleccion

       int res= Stream.of(1,2,3,4,5,6,7,8,9)
               .reduce( 0,(acomulador,elemento)->acomulador+elemento);
        System.out.println(res);


        String cadenaLenguajes = Stream.of("Java", "C", "Python", "Ruby")
                .reduce("", (acumulador, itemLenguaje) -> acumulador.equals("") ? itemLenguaje : acumulador + "|" + itemLenguaje );
        System.out.println(cadenaLenguajes);




    }
}
