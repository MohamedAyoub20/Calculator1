package calculator;

public class RetionalNumber implements Number, CommenMethod {

    private int numerator;
    private int denumenator;

    public RetionalNumber(int numerator, int denumenator) {
        this.numerator = numerator;
        this.denumenator = denumenator;
        reduse(numerator, denumenator);
        
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenumenator() {
        return denumenator;
    }

    public void setDenumenator(int denumenator) {
        this.denumenator = denumenator;
    }

    @Override
    public Number sum(Number n) {
        RetionalNumber rn = (RetionalNumber) n;
        int denumenator1 = rn.getDenumenator() * denumenator;
        int numenator1 = (rn.getDenumenator() * numerator) + (rn.getNumerator() * denumenator);
        return new RetionalNumber(numenator1, denumenator1);
    }

    @Override
    public Number sub(Number n) {
        RetionalNumber rn = (RetionalNumber) n;
        int denumenator1 = rn.getDenumenator() * denumenator;
        int numenator1 = (rn.getDenumenator() * numerator) - (rn.getNumerator() * denumenator);
        return new RetionalNumber(numenator1, denumenator1);
    }

    @Override
    public Number mul(Number n) {
        RetionalNumber rn = (RetionalNumber) n;
        return new RetionalNumber(rn.getNumerator() * numerator, rn.getDenumenator() * denumenator);
    }

    @Override
    public Number div(Number n) {
        RetionalNumber rn = (RetionalNumber) n;
        return new RetionalNumber(rn.numerator * denumenator, rn.getDenumenator() * numerator);
    }

    private void reduse(int numerator, int denumenator) {
        int gcd = 1;
        for (int i = Math.min(numerator, denumenator); i >= 2; i--) {
            if (numerator % i == 0 && denumenator % i == 0) {
                gcd = i;
                break;
            }
        }
        setNumerator(numerator / gcd);
        setDenumenator(denumenator / gcd);

    }

    @Override
    public String toString() {
        if (denumenator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denumenator;
        }
    }

}
