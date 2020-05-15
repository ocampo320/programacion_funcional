package burcaryobtener;

import obtenerLista.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("deibi", 20));
        users.add(new User("carlos", 18));
        users.add(new User("camila", 25));
        users.add(new User("monica", 22));
        users.add(new User("santi", 19));
        users.add(new User("pedro", 30));
        users.add(new User("monica", 30));
        User userDefauld=new User("sin nombre",0);


      User user=  users.stream().filter(u->u.getAge()==30)
        .findAny().orElse(userDefauld);
      System.out.println(user);




    }
}
