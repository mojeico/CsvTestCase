package com.company.entity;

import com.opencsv.bean.CsvBindByPosition;

public class Client {
    @CsvBindByPosition(position = 0)
    private String A;

    @CsvBindByPosition(position = 1)
    private String B;

    @CsvBindByPosition(position = 2)
    private String C;

    @CsvBindByPosition(position = 3)
    private String D;

    @CsvBindByPosition(position = 4)
    private String E;

    @CsvBindByPosition(position = 5)
    private String F;

    @CsvBindByPosition(position = 6)
    private String G;

    @CsvBindByPosition(position = 7)
    private String H;

    @CsvBindByPosition(position = 8)
    private String I;

    @CsvBindByPosition(position = 9)
    private String J;

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getE() {
        return E;
    }

    public void setE(String e) {
        E = e;
    }

    public String getF() {
        return F;
    }

    public void setF(String f) {
        F = f;
    }

    public String getG() {
        return G;
    }

    public void setG(String g) {
        G = g;
    }

    public String getH() {
        return H;
    }

    public void setH(String h) {
        H = h;
    }

    public String getI() {
        return I;
    }

    public void setI(String i) {
        I = i;
    }

    public String getJ() {
        return J;
    }

    public void setJ(String j) {
        J = j;
    }

    @Override
    public String toString() {
        return "MyCsv{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                ", E='" + E + '\'' +
                ", F='" + F + '\'' +
                ", G='" + G + '\'' +
                ", H='" + H + '\'' +
                ", I='" + I + '\'' +
                ", J='" + J + '\'' +
                '}';
    }

    public boolean verify(){

        if(this.A.isEmpty() || this.B.isEmpty() || this.C.isEmpty()){
            return true;
        }
        return false;

    }


}
