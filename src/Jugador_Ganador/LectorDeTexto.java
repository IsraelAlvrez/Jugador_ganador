package Jugador_Ganador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorDeTexto {


    public  String [] Lector_Entrada(String Ruta ){

        try{
            File Docuemento = new File(Ruta);
            Scanner sc = new Scanner(Docuemento);
            String [] Entradas = new String[Integer.parseInt(sc.nextLine())];

           try {


               int i = 0;
               while (sc.hasNextLine()) {
                   Entradas[i] = sc.nextLine();
                   i++;
               }
               if (Entradas.length != i ){
                   throw new IllegalArgumentException("tus el tamaño de tus rondas no coincide con el numero de tus rondas");
               }
           }catch (ArrayIndexOutOfBoundsException ex ){
               throw new IllegalArgumentException("tus el tamaño de tus rondas no coincide con el numero de tus rondas");

           }

            return Entradas;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}

