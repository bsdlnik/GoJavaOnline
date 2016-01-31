public class Main {
    public static void main(String[] args) {

        Directory dir = new Directory("HomeWork", new TextFile("main", 3, "java"), new TextFile("readme", 3, "txt"));
        dir.setFiles(new AudioFile("Melody", 7, "mp3"));
        dir.setName("HomeWorkRename");
        System.out.println(dir);

        // Тест. перемещаем файл. Копируем и удаляем из директории (агрегация)
        // есть также метод  copyFile который просто копирует файл
        BaseFile b = dir.moveFile("Melody");

        System.out.println(dir);

        dir = null;

        System.out.println();
        System.out.println("Директория уничтожена, все файлы уничтожены кроме Melody (его забираем)");
        System.out.println(dir);
        System.out.println(b);

    }
}
