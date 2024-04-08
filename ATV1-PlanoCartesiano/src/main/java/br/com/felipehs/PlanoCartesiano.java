package br.com.felipehs;

public class PlanoCartesiano {
    private double x;
    private double y;

    public static double calcularDistancia(PlanoCartesiano p1, PlanoCartesiano p2){
        return Math.sqrt(Math.pow((p1.getY() - p1.getX()), 2) + Math.pow((p2.getY() - p2.getX()), 2));
    }

    public PlanoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
