package principios;

public class Main {
    public static void main(String[] args) {

        Saludo saludo = (usuario) -> {
            System.out.println("hola mundo con funcional " + usuario);
        };
        saludo.Saludar("deibi");

        Saludo otroSaludo = nombre -> {
            if (nombre.equals("deibi")) {

                System.out.println("hola mundo con funcional eres deivi");

            } else {
                System.out.println("hola mundo con funcional " + nombre);

            }
        };
        otroSaludo.Saludar("deibi");
        Suma suma = (val1, val2) -> val1 + val2;
        int res = suma.suma(10, 20);
        System.out.println(res);


        suma = ((valor1, valor3) -> {
            int res2=valor1+valor3;
            System.out.println(res2);
            return res2;
        });
        suma.suma(30,45);


        Funciones funciones=(sum,cantidad)->{
            double prom=sum*cantidad;
            System.out.println(prom);
            return prom;
        };
          funciones.promedio(50,3);

        }
    }



