package sk.skuska.iterator;

public class Main {
    public static void main(String[] args) {
        Zoznam<Zamestnanec> zoznam = new Zoznam<>();
        zoznam.add(new Zamestnanec("jan","biely",10213120));
        zoznam.add(new Zamestnanec("jana","cervena",100));
        zoznam.add(new Zamestnanec("jakub","krasny",444440));

        ZoznamIterator<Zamestnanec> zamestnanecZoznamIterator = new ZoznamIterator<Zamestnanec>(zoznam);

        while(!zamestnanecZoznamIterator.isDone()){
            System.out.println(
                    zamestnanecZoznamIterator.currentItem().meno+" "+
                    zamestnanecZoznamIterator.currentItem().priezvisko+" "+
                    zamestnanecZoznamIterator.currentItem().plat
            );
            zamestnanecZoznamIterator.next();
        }
    }
}
