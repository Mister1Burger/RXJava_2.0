package home.rxjavatest;


public class Number {

    private Integer textNumber;
    private String numeralNumber;

    public Number (Integer textNumber, String numeralNumber) {
        this.textNumber = textNumber;
        this.numeralNumber = numeralNumber;
    }

    public Integer getTextNumber() {
        return textNumber;
    }

    public void setTextNumber(Integer textNumber) {
        this.textNumber = textNumber;
    }

    public String getNumeralNumber() {
        return numeralNumber;
    }

    public void setNumeralNumber(String numeralNumber) {
        this.numeralNumber = numeralNumber;
    }
}
