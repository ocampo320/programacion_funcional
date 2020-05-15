package ordenarlista;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>number=List.of(1,2,6,4,8,2,3,9,7,14,36,1,3,9,7);
        number.stream().sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(e->System.out.print(e));
    }
}
