package Manu.org;

import Manu.org.Condiciones.Condicion;

import java.util.ArrayList;

public class Pista extends PistaColeccion{

    private int id;
    private int duracion;
    private String artista;
    private String album;
    private ArrayList<String> generos;
    private int anio;
    private ArrayList<String> comentarios;
    public Pista(String nombre, int id, int duracion, String artista, String album, int anio) {
        super(nombre);
        this.id = id;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.generos = new ArrayList<>();
        this.anio = anio;
        this.comentarios = new ArrayList<>();
    }

    public float getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<String>(generos);
    }

    public void addGenero(String genero) {
        if (!generos.contains(genero.toUpperCase())) {
            generos.add(genero.toUpperCase());
        }
    }

    public void addGeneros(ArrayList<String> generos) {
        for (String genero : generos) {
            addGenero(genero);
        }
    }

    public boolean tieneGenero(String genero) {
        return generos.contains(genero.toUpperCase());
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<String> getComentarios() {
        return new ArrayList<String>(comentarios);
    }

    public void addComentario(String comentario) {
        comentarios.add(comentario);
    }

    public int getCantidad(){
        return 1;
    }

    public ArrayList<PistaColeccion> buscar(Condicion condicion){
        ArrayList<PistaColeccion> aux = new ArrayList<PistaColeccion>();
        if(condicion.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    public void imprimir(){
        System.out.println(this.getTitulo()+" - "+this.artista+" - "+this.album+"("+this.generos+", "+this.anio+")");
    }

}
