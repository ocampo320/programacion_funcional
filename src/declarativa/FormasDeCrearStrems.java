package declarativa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FormasDeCrearStrems {

    //colleciones
    List<persona>personal=new ArrayList<>();
    Stream<persona>stream= personal.stream();//abtracciones

    //stream
    Stream<persona> filter=stream.filter(p->p.getAge()>18);

    //ARREGLO
    int []number={1,2,3,4};
    Stream num=Stream.of(number);

    //secuencia
   Stream names= Stream.of("codi","codi2","codi3");

}
