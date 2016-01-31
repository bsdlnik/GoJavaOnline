public class Main {

    public static void main(String[] args) {
        BouquetOfFlowers bouquet = new BouquetOfFlowers("For lovely girl", new RoseFlower("Red", 5), new ChamomileFlower("White", 1), new TulipFlower("Blue", 2));
        bouquet.setFlowers(new AsterFlower("Pink", 2), new AsterFlower("Grey", 1));
        bouquet.setName("For lovely girl with grey Aster");
        System.out.println(bouquet);

        // Тест. Удаляем цветы из букета. Букет не может состоять меньше чем из трех цветов. Всегда будет минимум три цетка.
        bouquet.getFlower("Aster");
        bouquet.getFlower("Aster");
        bouquet.getFlower("Tulip");
        bouquet.getFlower("Chamomile");

        System.out.println(bouquet);

        System.out.println("--------------------");

        RoseBush roseBush = new RoseBush("Red rose bush", new RoseFlower("Red", 2), new RoseFlower("Red", 1), new RoseFlower("Red", 3), new RoseFlower("Red", 5), new RoseFlower("Red", 4));
        System.out.println(roseBush);
        roseBush.getFlower();
        System.out.println(roseBush);

    }

}
