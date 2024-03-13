import javax.management.InvalidAttributeValueException;

public class Carta {
    private ValorCarta valor;
    private Naipe naipe;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public ValorCarta getValorCarta() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return "Carta [nome=" + valor + ", naipe=" + naipe + ", valor=" + valor.getValor() + "]";
    }

}
