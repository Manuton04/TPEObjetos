package Manu.org;

import Manu.org.Condiciones.Condicion;

import java.util.ArrayList;

public class ColeccionAutomatica extends Coleccion{

    Condicion condicion;
    Coleccion coleccion;

    public ColeccionAutomatica(String nombre, Condicion condicion, Coleccion coleccion) {
        super(nombre);
        this.coleccion = coleccion;
        this.condicion = condicion;
        super.lista = coleccion.buscar(condicion);
    }

    public void setCondicion(Condicion condicion){
        this.condicion = condicion;
        super.lista = coleccion.buscar(condicion);
    }

    public Condicion getCondicion(){
        return condicion;
    }

    public ArrayList<PistaColeccion> getLista(){
        super.lista = coleccion.buscar(condicion);
        return lista;
    }

    public void imprimir(){
        super.lista = coleccion.buscar(condicion);
        for(PistaColeccion p : lista){
            p.imprimir();
        }
    }


}
