package ua.zp.brainacad;

public class Test {
    public static void main(String[] args) {



//      Объявление константы - System.out.println(Kniga.SHRIFT);
        Kniga kniga = new Kniga();
            System.out.println("Имя класса - Книга");
//        System.out.println("Имя класса: " + kniga.getClass().getName());
//        System.out.println(kniga.name);

            kniga.setGlava(10); // Или можно работать с полями класса - kniga.glava = 10;
            System.out.println("Количество глав: " + kniga.getGlava()); // Или kniga.glava
            kniga.setStranica(150);
            System.out.println("Количество страниц: " + kniga.getStranica());

        System.out.println();



//      Объявление константы - System.out.println(Otdelenie_Pochti.RABOTNIK);
        Otdelenie_Pochti p31 = new Otdelenie_Pochti();
            System.out.println("Имя класса - Отделение почты");

            p31.setPosilki(3);
            System.out.println("Количество посылок: " + p31.getPosilki());

        System.out.println();



//      Объявление константы - System.out.println(Klient_Magazina.KOLICH);
        Klient_Magazina klient = new Klient_Magazina();
            System.out.println("Имя класса - Магазин");

            klient.setTovar(5);
            System.out.println("Количество товаров: " + klient.getTovar());
            klient.setBonus(3);
            System.out.println("Количество бонусов: " + klient.getBonus());

        System.out.println();
    }
}
