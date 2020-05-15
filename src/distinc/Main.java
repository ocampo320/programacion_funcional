package distinc;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>name=List.of("DEIVI","DEIVI","JUAN");
        name.stream().distinct().forEach(e->System.out.println(e));
    }
}
