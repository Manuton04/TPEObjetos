package Manu.org.Comparadores;

import Manu.org.Pista;

import java.util.Comparator;

public interface Comparador extends Comparator<Pista> {
    int compare(Pista p1, Pista p2);
}
