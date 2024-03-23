package br.com.felipehs;

public class PlanoCartesiano {
    private double xA;
    private double xB;
    private double yA;
    private double yB;

    public static double calcularDistancia(double xA, double xB, double yA, double yB){
        return Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
    }

    public PlanoCartesiano(double xA, double xB, double yA, double yB) {
        this.xA = xA;
        this.xB = xB;
        this.yA = yA;
        this.yB = yB;
    }

    public double getxA() {
        return xA;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }
}
