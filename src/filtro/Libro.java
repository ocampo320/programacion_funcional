package filtro;

public class Libro {
    String libro;
    int valor;

    public Libro(String libro, int valor) {
        this.libro = libro;
        this.valor = valor;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "libro='" + libro + '\'' +
                ", valor=" + valor +
                '}';
    }
}
