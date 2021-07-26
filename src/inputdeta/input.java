package inputdeta;

import calculator.*;
import java.util.Scanner;

public abstract class input {

    public static RetionalNumber inputRetionalNumber() {
        System.out.println("enter numrator");
        int numerator = new Scanner(System.in).nextInt();
        System.out.println("enter denomenator");
        int denomenator = new Scanner(System.in).nextInt();
        return new RetionalNumber(numerator, denomenator);
    }

    public static CoplexNumber inputCoplexNumber() {
        System.out.println("enter real");
        int real = new Scanner(System.in).nextInt();
        System.out.println("enter imeg");
        int imeg = new Scanner(System.in).nextInt();
        return new CoplexNumber(real, imeg);
    }

    public static natural inputNaturalNumber() {
        System.out.println("enter number");
        return new natural(new Scanner(System.in).nextInt());
    }

}
