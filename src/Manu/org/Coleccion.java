package Manu.org;

import Manu.org.Condiciones.Condicion;

import java.util.ArrayList;

public class Coleccion extends PistaColeccion{
    protected ArrayList<PistaColeccion> lista;
    public Coleccion(String nombre) {
        super(nombre);
        this.lista = new ArrayList<>();
    }

    public void agregar(PistaColeccion p){
        lista.add(p);
    }

    public void agregarVarios(ArrayList<PistaColeccion> lista){
        this.lista.addAll(lista);
    }

    public void eliminar(PistaColeccion p){
        lista.remove(p);
    }

    public int getCantidad(){
        int n = 0;
        for(PistaColeccion p : lista){
            n += p.getCantidad();
        }
        return n;
    }

    public int getDuracion(){
        int n = 0;
        for(PistaColeccion p : lista){
            n += p.getDuracion();
        }
        return n;
    }

    public ArrayList<PistaColeccion> getLista(){
        return lista;
    }

    public ArrayList<PistaColeccion> buscar(Condicion condicion){
        ArrayList<PistaColeccion> aux = new ArrayList<PistaColeccion>();
        for(PistaColeccion p : lista){
            aux.addAll(p.buscar(condicion));
        }
        return aux;
    }

    public Coleccion getCopia(){
        Coleccion copia = new Coleccion("Copia de "+this.getTitulo());
        for (PistaColeccion p : lista){
            copia.agregar(p);
        }
        return copia;
    }

    public void imprimir(){
        for (PistaColeccion p : lista){
            p.imprimir();
        }
    }

    public void intercambiarPistas(PistaColeccion p1, PistaColeccion p2){
        int indice1 = lista.indexOf(p1);
        int indice2 = lista.indexOf(p2);
        if (indice1 != -1 && indice2 != -1) {
            PistaColeccion aux = lista.get(indice1);
            lista.set(indice1, lista.get(indice2));
            lista.set(indice2, aux);
        }
    }
}
