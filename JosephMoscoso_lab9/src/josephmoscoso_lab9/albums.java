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
public class albums {

    private String nombre;
    private String artista;
    ArrayList<canciones> songs = new ArrayList();

    public albums() {
    }

    public albums(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<canciones> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<canciones> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "albums{" + "nombre=" + nombre + ", artista=" + artista + ", songs=" + songs + '}';
    }

}
