/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephmoscoso_lab9;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class playlist {

    private String nombre;
    ArrayList<canciones> songs = new ArrayList();

    public playlist() {
    }

    public playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<canciones> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<canciones> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "playlist{" + "nombre=" + nombre + ", songs=" + songs + '}';
    }

}
