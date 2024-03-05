import javax.management.InvalidAttributeValueException;

public class Retangulo {

    private final int lado1;
    private final int lado2;

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getArea() {
        return lado1 * lado2;
    }

    public int getPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public Retangulo(int lado1, int lado2) {
        if (lado1 < 0)
            throw new IllegalArgumentException("Lado1 deve ser maior que 0");
        if (lado2 < 0)
            throw new IllegalArgumentException("Lado2 deve ser maior que 0");

        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Retangulo() {
        this.lado1 = 1;
        this.lado2 = 1;
    }

}
