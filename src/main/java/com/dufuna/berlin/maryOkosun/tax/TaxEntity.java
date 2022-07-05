package com.dufuna.berlin.maryOkosun.tax;

@Entity
public class TaxEntity {

    private int bracketOne;
    private int bracketTwo;
    private int bracketThree;
    private int bracketFour;

    private int rateOne;
    private double rateTwo;
    private double rateThree;
    private double rateFour;
    private double rateFive;

    public int getRateOne() {
        return 0;
    }

    public void setRateOne(int rateOne) {
        this.rateOne = rateOne;
    }

    public double getRateTwo() {
        return 0.19;
    }

    public void setRateTwo(double rateTwo) {
        this.rateTwo = rateTwo;
    }

    public double getRateThree() {
        return 0.325;
    }

    public void setRateThree(double rateThree) {
        this.rateThree = rateThree;
    }

    public double getRateFour() {
        return 0.37;
    }

    public void setRateFour(double rateFour) {
        this.rateFour = rateFour;
    }

    public double getRateFive() {
        return 0.45;
    }

    public void setRateFive(double rateFive) {
        this.rateFive = rateFive;
    }


    public int getBracketOne() {
        return 18201;
    }

    public void setBracketOne(int bracketOne) {
        this.bracketOne = bracketOne ;
    }

    public int getBracketTwo() {
        return 37001;
    }

    public void setBracketTwo(int bracketTwo) {
        this.bracketTwo = bracketTwo;
    }

    public int getBracketThree() {
        return 90001;
    }

    public void setBracketThree(int bracketThree) {
        this.bracketThree = bracketThree;
    }

    public int getBracketFour() {
        return 180001;
    }

    public void setBracketFour(int bracketFour) {
        this.bracketFour = bracketFour;
    }

}
