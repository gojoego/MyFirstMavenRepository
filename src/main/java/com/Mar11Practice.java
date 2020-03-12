package com;


public class Mar11Practice {

    public boolean age(int b){
        if (b > 33) {
            return true;
        }
        return false;
    }

    public double cylinderVol(double r, double h) {
        return (Math.PI) * (r*r) * h;
    }

    public double bodyMassIndex(double w, double h){
        return w/(h*h);
    }

    public double yearToMinutes(double x) {
        return x * 525600;
    }

    public void olderOrYounger(int j){
        if (j < 33){
            System.out.println("you're younger than me");
        } else if (j == 33){
            System.out.println("we're the same age");
        } else {
            System.out.println("you're older than me");
        }
    }

    public static void main(String[] args) {


        Mar11Practice test = new Mar11Practice();
        System.out.println(test.cylinderVol(5,6));


    }

}
