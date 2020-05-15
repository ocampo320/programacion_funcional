package declarativa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<persona> users = new ArrayList<>();
        int contador = 0;
        users.add(new persona("deibi", 20));
        users.add(new persona("carlos", 18));
        users.add(new persona("camila", 25));
        users.add(new persona("monica", 22));
        users.add(new persona("santi", 19));
        users.add(new persona("pedro", 25));
        users.add(new persona("monica", 30));


        contador = (int) users.stream()
                .filter(user -> user.getAge() > 20)
                .filter(user -> user.getName().startsWith("c"))
                .count();


        System.out.println("filtro " + contador);

        int can = (int) users.stream().count();
        System.out.println("cantidad en lista " + can);




    }
}
