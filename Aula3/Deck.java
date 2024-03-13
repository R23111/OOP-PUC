import java.util.Arrays;
import java.util.Random;

public class Deck {
    private final int MAX_VALUE = 104;
    private int size;
    private Carta[] deck;

    public Deck(){
        size = 0;
        deck = new Carta[0];
    }

    public void addCarta(Carta carta){
        if(size+1 > MAX_VALUE){
            System.out.println("Valor maximo ultrapassado, carta nao adicionada");
            return;
        }
        Carta[] new_deck = new Carta[++size];
        for(int i = 0; i < deck.length; i++){
            new_deck[i] = deck[i];
        }
        new_deck[size-1] = carta;
    }

    public Carta retirarDeCima(){
        Carta[] new_deck = new Carta[--size];
        for(int i = 0; i < deck.length-1; i++){
            new_deck[i] = deck[i];
        }
        Carta c = deck[size];
        deck = new_deck;
        return c;
    }

    public Carta retirarDeBaixo(){
        Carta[] new_deck = new Carta[--size];
        for(int i = 1; i < deck.length; i++){
            new_deck[i-1] = deck[i];
        }
        Carta c = deck[0];
        deck = new_deck;
        return c;
    }

    public void encherBaralho() {
        Carta[] new_deck = new Carta[MAX_VALUE];
        int idx = 0;
        for (int i = 0; i < 2; i++)
            for (Naipe naipe : Naipe.values()) {
                for (ValorCarta valor : ValorCarta.values()) {
                    Carta c = new Carta(valor, naipe);
                    new_deck[idx++] = c;
                }
            }
        deck = new_deck;
        size = MAX_VALUE;
    }

    public void embaralharBaralho(){
        Carta[] new_deck = new Carta[size];
        Random random = new Random();
        System.out.println(size);
        for(int i = 0; i < size; i++){
            int idx = random.nextInt(size - i) + i;
            Carta temp = deck[i];
            deck[i] = deck[idx];
            deck[idx] = deck[i];
            
            new_deck[i] = deck[i];
        }
        deck = new_deck;
    }

    public int somaDeValores(){
        int sum = 0;
        for(Carta c : deck){
            sum += c.getValorCarta().getValor();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Baralho [cartas=" + Arrays.toString(deck) + "]";
    }

}
