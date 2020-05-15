package filtro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Libro> libro = new ArrayList<>();

        //MOSTRAR EN CONSOLA LA LISTA DE LOS TRES LIBROS MAS VENDIDOS
        //ORDENAR POR COPIAS

        libro.add(new Libro("el señor de los anillos", 150));
        libro.add(new Libro("don quijote de la mancha", 500));
        libro.add(new Libro("hitoria de dos ciudades", 200));
        libro.add(new Libro("el hobbit", 140));

        Comparator<Libro> comparador = Comparator
                .comparing(book -> book.getValor());
        libro.stream()
                .sorted(comparador.reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getLibro()));
    }
}
