public class Main {
    public static void main(String[] args) {
        MusicShop shop = new MusicShop("Crazy Guitars", new Guitar("Gibson"), new Guitar("Balalaika"), new Guitar("Dean"), new Piano("Black Note"));
        shop.setInstruments(new Trumpet("White Note"), new Trumpet("Blue Note"));
        System.out.println(shop);
        shop.getInstrument("Guitar");
        System.out.println(shop);
    }
}
