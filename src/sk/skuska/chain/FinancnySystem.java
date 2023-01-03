package sk.skuska.chain;

import java.util.Scanner;

public class FinancnySystem {
    public static void main(String[] args) {
        Zodpovedny zodpovedny = new Zodpovedny();
        zodpovedny.setNext(new Veduci());
        zodpovedny.setNext(new Riaditel());
        zodpovedny.setNext(new VicePresident());
        zodpovedny.setNext(new President());

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<3; i++){
            System.out.println("ake mate vydavky aby sme schvalili 😉:");
            zodpovedny.handle(sc.nextInt());
        }
    }
}
