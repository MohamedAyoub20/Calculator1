package calculator;

public class CoplexNumber implements Number, CommenMethod {

    private int real;
    private int imeg;

    public CoplexNumber(int real, int imeg) {
        this.real = real;
        this.imeg = imeg;
    }

    public int getImeg() {
        return imeg;
    }

    public void setImeg(int imeg) {
        this.imeg = imeg;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public Number sum(Number n) {
        CoplexNumber cn = (CoplexNumber) n;
        return new CoplexNumber(cn.getReal() + real, cn.getImeg() + imeg);
    }

    @Override
    public Number sub(Number n) {
        CoplexNumber cn = (CoplexNumber) n;
        return new CoplexNumber(cn.getReal() - real, cn.getImeg() - imeg);
    }

    @Override
    public Number mul(Number n) {
        CoplexNumber cn = (CoplexNumber) n;
        int real1 = (real * cn.getReal()) - (imeg * cn.getImeg());
        int imeg1 = (cn.getImeg() + real) + (cn.getReal() * imeg);
        return new CoplexNumber(real1, imeg1);
    }

    @Override
    public Number div(Number n) {
        CoplexNumber cn = (CoplexNumber) n;
        int denomenatorCoplex = (cn.getImeg() * cn.getImeg()) + (cn.getReal() * cn.getReal());
        int real1 = ((cn.getReal() * real) + (cn.getImeg() * imeg)) / denomenatorCoplex;
        int imeg1 = ((cn.getReal() * imeg) - (real * cn.getImeg())) / denomenatorCoplex;
        return new CoplexNumber(real1, imeg1);
    }

    @Override
    public String toString() {
        if (imeg == 0) {
            return real + "";
        }
        if (real == 0) {
            return imeg + "i";
        }
        if (imeg < 0) {
            return real + " - " + (-imeg) + "i";
        }
        return real + " + " + imeg + "i";
    }

}
