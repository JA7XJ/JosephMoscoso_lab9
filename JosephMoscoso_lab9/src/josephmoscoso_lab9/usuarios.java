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
public class usuarios {

    private String nombre;
    private int edad;
    private String user;
    private String contra;
    ArrayList<playlist> playlist = new ArrayList();
    ArrayList<favoritos> favoritos = new ArrayList();

    public usuarios() {
    }

    public usuarios(String nombre, int edad, String user, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<favoritos> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<favoritos> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return "usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", user=" + user + ", contra=" + contra + ", playlist=" + playlist + ", favoritos=" + favoritos + '}';
    }
    
}
