class Main{
    public static void main(String[] args) {
        Deck d = new Deck();
        d.encherBaralho();
        System.out.println(d.toString());
        d.embaralharBaralho();
        System.out.println(d.toString());
    }
}