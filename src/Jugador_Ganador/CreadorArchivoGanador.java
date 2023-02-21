package Jugador_Ganador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreadorArchivoGanador {

    public  void CreadorSalida(String RutaSalida,int [] Ganador) throws IOException {
        File salida  = new File(RutaSalida);
        salida.createNewFile();
        FileWriter escritor = new FileWriter(salida);
        BufferedWriter bw=new BufferedWriter(escritor);

        bw.write(Integer.toString(Ganador[0]));
        bw.write(" ");
        bw.write(Integer.toString(Ganador[1]));
        bw.close();

    }
}
