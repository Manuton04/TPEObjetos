package Manu.org;

import Manu.org.Condiciones.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pista ElTiempoNoPara = new Pista("El tiempo no para", 1, 311, "Bersuit Vergarabat", "De la cabeza", 2002);
        ElTiempoNoPara.addGenero("Rock nacional");
        Pista MiCaramelo = new Pista("Mi caramelo", 2, 290, "Bersuit Vergarabat", "De la cabeza", 2002);
        MiCaramelo.addGenero("Rock nacional");
        Pista PartyRockAnthem = new Pista("Party Rock Anthem", 3, 408, "LMFAO", "Sorry for Party Rocking", 2011);
        PartyRockAnthem.addGenero("Electro pop");
        Pista SorryForPartyRocking = new Pista("Sorry for Party Rocking", 4, 421, "LMFAO", "Sorry for Party Rocking", 2011);
        SorryForPartyRocking.addGenero("Electro pop");
        Pista FixYou = new Pista("Fix you", 5, 255, "Coldplay", "X&Y", 2005);
        FixYou.addGenero("Rock alternativo");
        Pista SpeedOfSound = new Pista("Speed of Sound", 6, 455, "Coldplay", "X&Y", 2005);
        SpeedOfSound.addGenero("Rock alternativo");
        Pista VivaLaVida = new Pista("Viva la vida", 7, 320, "Coldplay", "Viva la vida", 2008);
        VivaLaVida.addGenero("Rock alternativo");
        Pista WhitOrWhitoutYou = new Pista("Whit or whitout you", 8, 360, "U2", "The Joshua Tree", 1987);
        WhitOrWhitoutYou.addGenero("Rock");
        Pista Vertigo = new Pista("Vertigo", 9, 355, "U2", "How to Dismantle an Atomic Bomb", 2004);
        Vertigo.addGenero("rock");
        Pista CityOfBlindingLights = new Pista("City of Blinding Lights", 10, 284, "U2", "How to Dismantle an Atomic Bomb", 2004);
        CityOfBlindingLights.addGenero("Rock");
        Pista ALaLuzDeLaLuna = new Pista("A la luz de la luna", 11, 438, "El Indio Solari", "Pajaritos, bravos muchachitos", 2013);
        ALaLuzDeLaLuna.addGenero("rock nacional");
        Pista YoCanibal = new Pista("Yo Canibal", 12, 258, "Patricio rey y sus redonditos de ricota", "Lobo Suelto, Cordero atado", 1993);
        YoCanibal.addGenero("Rock Nacional");

        Coleccion ClasicosDelRock = new Coleccion("Clasicos del rock");
        ClasicosDelRock.agregar(ElTiempoNoPara);
        ClasicosDelRock.agregar(MiCaramelo);
        ClasicosDelRock.agregar(WhitOrWhitoutYou);
        ClasicosDelRock.agregar(Vertigo);
        ClasicosDelRock.agregar(CityOfBlindingLights);
        ClasicosDelRock.agregar(YoCanibal);

        Coleccion LoMejor = new Coleccion("Lo mejor");
        LoMejor.agregar(PartyRockAnthem);
        LoMejor.agregar(SorryForPartyRocking);
        LoMejor.agregar(VivaLaVida);
        LoMejor.agregar(YoCanibal);

        Coleccion Coldplay = new Coleccion("Coldplay");
        Coldplay.agregar(FixYou);
        Coldplay.agregar(SpeedOfSound);
        Coldplay.agregar(VivaLaVida);

        Coleccion ElIndio = new Coleccion("EL Indio");
        ElIndio.agregar(YoCanibal);
        ElIndio.agregar(ALaLuzDeLaLuna);

        Coleccion SistemaDeMusica = new Coleccion("Sistema de musica");
        SistemaDeMusica.agregar(ClasicosDelRock);
        SistemaDeMusica.agregar(LoMejor);
        SistemaDeMusica.agregar(Coldplay);
        SistemaDeMusica.agregar(ElIndio);

        /*
        ClasicosDelRock.imprimir();
        System.out.println();
        LoMejor.imprimir();
        System.out.println();
        Coldplay.imprimir();
         */

        Condicion aa = new CondicionDuracion(400);
        Condicion bb = new CondicionGenero("Rock");
        Condicion c1 = new CondicionNombre("rock");
        Condicion c2 = new CondicionArtista("LFMAO");
        Condicion c3 = new CondicionNot(c2);
        Condicion cc = new CondicionAnd(c1, c3);
        Condicion d1 = new CondicionAnio(2006);
        Condicion d2 = new CondicionArtista("ColdPlay");
        Condicion d3 = new CondicionAnd(bb, d1);
        Condicion d4 = new CondicionAnd(bb, d2);
        Condicion dd = new CondicionOR(d3, d4);


        Coleccion a = new Coleccion("a");
        a.agregarVarios(SistemaDeMusica.buscar(aa));
        Coleccion b = new Coleccion("b");
        b.agregarVarios(SistemaDeMusica.buscar(bb));
        Coleccion c = new Coleccion("c");
        c.agregarVarios(SistemaDeMusica.buscar(cc));
        Coleccion d = new Coleccion("d");
        d.agregarVarios(SistemaDeMusica.buscar(dd));


        /*
        a.imprimir();
        System.out.println();
        b.imprimir();
        System.out.println();
        c.imprimir();
        System.out.println();
        d.imprimir();
        System.out.println();

         */

        /*
        System.out.println("Duracion total: "+ SistemaDeMusica.getDuracion());
        System.out.println("Duracion Clasicos del rock: "+ ClasicosDelRock.getDuracion());
        System.out.println("Duracion Lo mejor: "+ LoMejor.getDuracion());
        System.out.println("Duracion Coldplay: "+ Coldplay.getDuracion());
        System.out.println("Duracion El Indio: "+ ElIndio.getDuracion());
        System.out.println("Duracion 4a: "+ a.getDuracion());
         */

        Coleccion LoMejorMasMas = LoMejor.getCopia();
        LoMejorMasMas.setTitulo("Lo mejor++");
        LoMejorMasMas.intercambiarPistas(PartyRockAnthem, VivaLaVida);
        
        /*
        LoMejor.imprimir();
        System.out.println();
        LoMejorMasMas.imprimir();
         */

        Coleccion PlaylistAuto = new ColeccionAutomatica("Todo lo de Coldplay", d2, SistemaDeMusica);

        PlaylistAuto.imprimir();

        Pista Paradise = new Pista("Paradise", 13, 365, "Coldplay", "Mylo Xyloto", 2011);
        Paradise.addGenero("Rock alternativo");
        SistemaDeMusica.agregar(Paradise);

        System.out.println();
        System.out.println("Despues:");
        PlaylistAuto.imprimir();




    }
}