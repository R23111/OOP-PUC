public enum ValorCarta {
    AS(11),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    VELETE(10),
    DAMA(10),
    REI(10);

    private int valor;

    private ValorCarta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
