package sk.skuska.builder;

public class BuilderHra {
    public static void main(String[] args) {
        PostavaBuilder bojovnikBuilder = new BojovnikBuilder();
        PostavaBuilder sedlakBuilder = new SedliakBuilder();

        Postava bojovnik = bojovnikBuilder
                .pridajSpravanie()
                .pridajOblecenie()
                .pridajZbran()
                .getPostava();
        Postava sedlak =  sedlakBuilder
                .pridajSpravanie()
                .pridajOblecenie()
                .pridajZbran()
                .getPostava();

        System.out.println(bojovnik);
        System.out.println(sedlak);

    }
}
