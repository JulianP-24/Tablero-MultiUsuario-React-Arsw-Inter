package edu.escuelaing.arsw.Service;

import java.util.ArrayList;

import edu.escuelaing.arsw.Model.Datos;

public class Memoria {
    private static final Memoria instance = new Memoria();
    private ArrayList<String> al = new ArrayList<String>();
    private ArrayList<Datos> data = new ArrayList<Datos>();

    public Memoria() {

    }
    
    public static Memoria getInstance() {
        return instance;
    }
    
    public void add(String value) {
        al.add(value);
    }

    public void addd(Datos value) {
        data.add(value);
    }

    public String toString() {
        return al.toString();
    }

    public ArrayList<Datos> getDatos() {
        return data;
    }
}
