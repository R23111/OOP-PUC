class Main{
    public static void main(String[] args) {
        BetterDeck d = new BetterDeck();
        d.encherBaralho();


        System.out.println(d.toString());
        d.embaralharBaralho();
        System.out.println(d.toString());
        System.out.println(d.somaDeValores());
        System.out.println(d.retirarDeBaixo());
        System.out.println(d.retirarDeCima());
    }
}