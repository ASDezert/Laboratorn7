package ua.zp.brainacad;

public class Test {
    public static void main(String[] args) {
        System.out.println(Kniga.SHRIFT);
        Kniga kniga = new Kniga();
        System.out.println("Имя класса: " + kniga.getClass().getName());
//        System.out.println(kniga.name);
        kniga.name = "Net";
        System.out.println("Имя книги: " + kniga.name);
        kniga.nomer = 123;
        System.out.println("Номер книги: " + kniga.nomer);
        System.out.println();


        System.out.println(Otdelenie_Pochti.RABOTNIK);
        Otdelenie_Pochti t31 = new Otdelenie_Pochti();
        t31.name1 = "Pochta 31";
        System.out.println(t31.name1);

        System.out.println(Klient_Magazina.KOLICH);
        Klient_Magazina klient = new Klient_Magazina();
        klient.nomer = 1;
        System.out.println(klient.nomer);
    }
}
