package runproject;

import calculator.*;
import inputdeta.input;
import java.util.Scanner;

public class Testproject {

    public static void main(String[] args) {
        run();
    }

    public static void select() {
        System.err.println("enter (1) to sum two natural number");
        System.err.println("enter (2) to sub two natural number");
        System.err.println("enter (3) to div two natural number");
        System.err.println("enter (4) to mul two natural number");
        System.err.println("-----------------------------------");
        System.err.println("enter (5) to sum two complex number");
        System.err.println("enter (6) to sub two complex number");
        System.err.println("enter (7) to div two complex number");
        System.err.println("enter (8) to mul two complex number");
        System.err.println("-----------------------------------");
        System.err.println("enter (9) to mul two retional number");
        System.err.println("enter(10) to mul two retional number");
        System.err.println("enter(11) to mul two retional number");
        System.err.println("enter(12) to mul two retional number");
    }

    public static void printDeta() {
        select();
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                natural n = input.inputNaturalNumber();
                System.err.println(n.sum(input.inputNaturalNumber()));
                break;
            case 2:
                natural n1 = input.inputNaturalNumber();
                System.err.println(n1.sub(input.inputNaturalNumber()));
                break;
            case 3:
                natural n2 = input.inputNaturalNumber();
                System.err.println(n2.div(input.inputNaturalNumber()));
                break;
            case 4:
                natural n3 = input.inputNaturalNumber();
                System.err.println(n3.mul(input.inputNaturalNumber()));
                break;
            case 5:
                CoplexNumber cn = input.inputCoplexNumber();
                System.err.println(cn.sum(input.inputCoplexNumber()));
                break;
            case 6:
                CoplexNumber cn1 = input.inputCoplexNumber();
                System.err.println(cn1.sub(input.inputCoplexNumber()));
                break;
            case 7:
                CoplexNumber cn2 = input.inputCoplexNumber();
                System.err.println(cn2.div(input.inputCoplexNumber()));
                break;
            case 8:
                CoplexNumber cn3 = input.inputCoplexNumber();
                System.err.println(cn3.mul(input.inputCoplexNumber()));
                break;
            case 9:
                RetionalNumber rn = input.inputRetionalNumber();
                System.err.println(rn.sum(input.inputRetionalNumber()));
                break;
            case 10:
                RetionalNumber rn1 = input.inputRetionalNumber();
                System.err.println(rn1.sub(input.inputRetionalNumber()));
                break;
            case 11:
                RetionalNumber rn2 = input.inputRetionalNumber();
                System.err.println(rn2.div(input.inputRetionalNumber()));
                break;
            case 12:
                RetionalNumber rn3 = input.inputRetionalNumber();
                System.err.println(rn3.mul(input.inputRetionalNumber()));
                break;
            default:
                System.err.println("this operation dont found");
        }
    }

    public static void run() {
        while (true) {
            printDeta();
            System.err.println("enter (s) to stop ---- enter (c) to continue");
            if (new Scanner(System.in).next().charAt(0) == 's') {
                break;
            }
        }
    }

}
