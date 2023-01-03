package sk.skuska.absFactory;

public class Hra {
    public static void main(String[] args) {
        System.out.println("Hra spustena, idem vytvarat postavy");
        SCervenouCiapockouAVlkom vlkFactory = new SCervenouCiapockouAVlkom();
        SPrinceznouADrakom princeznaFactory = new SPrinceznouADrakom();

        Postava postava1 = vlkFactory.vytvorPostavicku();
        Zviera postava2 = vlkFactory.vytvorZvieratko();
        Postava postava3 = princeznaFactory.vytvorPostavicku();
        Zviera postava4 = princeznaFactory.vytvorZvieratko();

        postava1.rozpravaj();
        postava2.rozpravaj();
        postava3.rozpravaj();
        postava4.rozpravaj();

    }
}
