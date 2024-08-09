package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionAlbum extends Condicion{
    private String album;

    public CondicionAlbum(String album){
        this.album = album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getAlbum(){
        return album;
    }

    public boolean cumple(Pista ee){
        return ee.getAlbum().toUpperCase().contains(album.toUpperCase());
    }
}
