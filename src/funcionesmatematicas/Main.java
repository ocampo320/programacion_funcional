package funcionesmatematicas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,2,3,4,5,6,7,8,9);
        long cantidad=numbers.stream().filter(n->n<6).count();
        System.out.println(cantidad);


        //suma
        int sum=numbers.stream().mapToInt(n->n).sum();
        System.out.println(sum);

        //overage ontener promedio
      double promedio=  numbers.stream().mapToInt(n->n).average().orElse(0);
        System.out.println(promedio);

        //numero menor metodo min()
        int min=numbers.stream().mapToInt(n->n).min().getAsInt();
        System.out.println(min);

        //numero mayo metod max()
        int max=numbers.stream().mapToInt(n->n).max().getAsInt();
        System.out.println(max);

    }
}
