package practica_todo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

/**
 * Obtener la cantidad de cursos con una duración mayor a 5 horas.
 */

        int contadorCursosMayor = 0;
        contadorCursosMayor = (int) cursos.stream()
                .filter(e -> e.getDuracion() > 5)
                .count();

        System.out.println("cantidad de cursos con una duración mayor a 5 horas: " + contadorCursosMayor);


        /**
         * Obtener la cantidad de cursos con una duración menor a 2 horas.
         */

        int contadorCursosMenor = 0;
        contadorCursosMenor = (int) cursos.stream()
                .filter(e -> e.getDuracion() < 2)
                .count();
        System.out.println("cantidad de cursos con una duración menor a 2 horas: " + contadorCursosMenor);
System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");

        /**
         * Listar el título de todos aquellos
         * cursos con una cantidad de vídeos mayor a 50
         */
        System.out.println("Lista de cursos con mas de 50 videos");
        Comparator<Curso> comparator = Comparator
                .comparing(e -> e.getVideos());
        cursos.stream()
                .sorted(comparator)
                .forEach(e -> System.out.println(e.getTitulo()));
        System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");


        /**
         * Mostrar en consola el título de los 3 cursos con mayor duración
         */
        System.out.println("Mostrar en consola el título de los 3 cursos con mayor duración");
        Comparator<Curso> comparaDuracion =Comparator
                .comparing(e->e.getDuracion());
        cursos.stream()
                .sorted(comparator)
                .limit(3)
                .forEach(e->System.out.println(e.getTitulo()));
        System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");


        /**
         *Mostrar en consola la duración total de todos los cursos
         */
        int sumaDuracion=cursos.stream()
                .mapToInt(n->(int)n.getDuracion()).sum();
        System.out.println("Mostrar en consola la duración total de todos los cursos: "+sumaDuracion);

        System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");

        /**
         * Mostrar en consola todos aquellos libros
         * que superen el promedio en cuanto a duración se refiere
         */
        double promedio=  cursos.stream().mapToInt(n->(int)n.getDuracion())
                .average().orElse(0);
        System.out.println("promedio en cuanto a duración se refiere: "+promedio);

        System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");

        /**
         * Mostrar en consola la duración de todos aquellos
         * cursos que tengan una cantidad de alumnos inscritos menor a 500.
         */
        System.out.println("cursos que tengan una cantidad de alumnos inscritos menor a 500");
        Comparator<Curso>comparator1=Comparator
                .comparing(e->e.getAlumnos());
        cursos.stream().sorted(comparator1)
                .forEach(e->System.out.println(e.getTitulo()));


        /**
         * Obtener el curso con mayor duración
         */

        System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");
        System.out.println(" Obtener el curso con mayor duración");

        int maxDuracion=cursos.stream().mapToInt(n->(int)n.getDuracion()).max().getAsInt();
        System.out.println(maxDuracion);

        System.out.println("\n");
        System.out.println("-----------------------------------------------------\n");
        /**
         * Crear una lista de Strings con todos los titulos de los cursos
         */
        System.out.println("Crear una lista de Strings con todos los titulos de los cursos");
        List<String>titulos=new ArrayList<>();
        titulos=cursos.stream()
                .map(e->e.getTitulo()).collect(Collectors.toList());
        System.out.println(titulos);


    }

}
