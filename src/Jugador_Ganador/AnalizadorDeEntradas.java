package Jugador_Ganador;

import java.util.Arrays;

public class AnalizadorDeEntradas {

    public  String[] AnalizadarEntradaCorrecta (String []Entrda){



        if ( Entrda.length <= 0 || Entrda.length >10000 ){
            throw new IllegalArgumentException("tu entrada no debe igual o menor a 0 y mayor a 10000");
        }

        for (int i = 0; i <Entrda.length;i++){
            if (!Entrda[i].matches("^[0-9]+\\s[0-9]+$")){
                System.out.println(Arrays.toString(Entrda));
                throw new IllegalArgumentException("Tu entrada tiene Caracteres que no son numermos");
            }
        }


        return Entrda;
    }


}
