package obtenerLista;

import declarativa.persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("deibi", 20));
        users.add(new User("carlos", 18));
        users.add(new User("camila", 25));
        users.add(new User("monica", 22));
        users.add(new User("santi", 19));
        users.add(new User("pedro", 25));
        users.add(new User("monica", 30));

        List<User>filtrado=users.stream().filter(u->u.getAge()>20)
                .collect(Collectors.toList());

        System.out.println(filtrado);
    }
}
