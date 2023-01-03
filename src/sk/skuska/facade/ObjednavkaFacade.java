package sk.skuska.facade;

public class ObjednavkaFacade {

    public void objednavka(String nazovTovaru, String nazovDodavatela, int pocetTovaru, int cenaTovaru) {
        Objednavka objednavka =
                new Objednavka(
                    new Dodavatel(nazovDodavatela),
                    new Tovar(nazovTovaru, cenaTovaru),
                    pocetTovaru
                );
        objednavka.objednaj();
    }

}
