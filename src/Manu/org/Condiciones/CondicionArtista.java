package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionArtista extends Condicion{

    private String artista;

    public CondicionArtista(String artista){
        this.artista = artista;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public String getArtista(){
        return artista;
    }

    public boolean cumple(Pista ee){
        return ee.getArtista().toUpperCase().contains(artista.toUpperCase());
    }
}
