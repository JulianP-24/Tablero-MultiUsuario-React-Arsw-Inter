package edu.escuelaing.arsw.Model;

public class Datos {
    private double posX;
    private double posY;
    private String user;

    public Datos(String user, double x, double y) {
        this.user = user;
        this.posX = x;
        this.posY = y;
    }

    public double getX() {
        return posX;
    }

    public void setPosX(double x) {
        this.posX = x;
    }

    public double getY() {
        return posY;
    }

    public void setPosY(double y) {
        this.posY = y;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user= user;
    }
}
