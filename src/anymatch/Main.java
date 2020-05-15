package anymatch;

import java.util.List;

public class Main {
    /**
     * conocer si por lo menos un alumno posee
     * una calificacion no aprobatoria
     * la calificacion minima es de 6
     * @param args
     */
    public static void main(String[] args) {
        List<Integer>calificaciones=List.of(10,10,9,6,6,7,8,9,10);

        boolean result=calificaciones.stream()
                .anyMatch(cal->cal<6);
        System.out.println(result);
    }
}
