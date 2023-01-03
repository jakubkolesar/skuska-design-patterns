package sk.skuska.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ObjednavkaFacade objednavkaFacade = new ObjednavkaFacade();
        objednavkaFacade.objednavka("plastelina", "fedEx", 3, 2);
        objednavkaFacade.objednavka("lego", "polar express", 15, 10);
        objednavkaFacade.objednavka("horcica", "horcicak", 20, 1);
    }
}
