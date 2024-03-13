import java.util.Random;

/**
 * BetterDeck
 */
public class BetterDeck {

    private final int MAX_VALUE = 104;
    private int proxLivre;
    private Carta[] deck;

    public BetterDeck() {
        deck = new Carta[MAX_VALUE];
        proxLivre = 0;
    }

    public void addCarta(Carta carta) {
        deck[proxLivre++] = carta;
    }

    public Carta retirarDeCima() {
        Carta carta = deck[--proxLivre];
        return carta;
    }

    public Carta retirarDeBaixo() {
        Carta carta = deck[0];
        for (int i = 0; i < proxLivre-1; i++) {
            deck[i] = deck[i + 1];
        }
        proxLivre--;
        return carta;
    }

    public void encherBaralho() {
        int idx = 0;
        for (int i = 0; i < 2; i++)
            for (Naipe naipe : Naipe.values()) {
                for (ValorCarta valor : ValorCarta.values()) {
                    Carta c = new Carta(valor, naipe);
                    deck[idx++] = c;
                }
            }
        proxLivre = MAX_VALUE;
    }

    public int somaDeValores() {
        int sum = 0;
        for (int i = 0; i < proxLivre; i++) {
            sum += deck[i].getValorCarta().getValor();
        }
        return sum;
    }

    public void embaralharBaralho() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int idx1 = random.nextInt(proxLivre - 1);
            int idx2 = random.nextInt(proxLivre - 1);

            Carta temp = deck[idx1];
            deck[idx1] = deck[idx2];
            deck[idx2] = temp;

        }
    }

    @Override
    public String toString() {
        String str = "Baralho cartas=";
        for(int i = 0; i < proxLivre; i++){
            str+="\n+" + deck[i].toString();
        }

        return str;
    }

}