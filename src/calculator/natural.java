package calculator;

public class natural implements Number, CommenMethod {

    private double number;

    public natural(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public Number sum(Number n) {
        natural na = (natural) n;
        return new natural(na.getNumber() + number);
    }

    @Override
    public Number sub(Number n) {
        natural na = (natural) n;
        return new natural(na.getNumber() - number);
    }

    @Override
    public Number mul(Number n) {
        natural na = (natural) n;
        return new natural(na.getNumber() * number);
    }

    @Override
    public Number div(Number n) {
        natural na = (natural) n;
        return new natural(na.getNumber() / number);
    }

    @Override
    public String toString() {
        return "number=" + number;
    }

}
