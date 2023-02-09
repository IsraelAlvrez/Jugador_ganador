package Jugador_Ganador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Creador_Archivo_ganador extends Lector_de_Texto{

    public  void Creador_salida(String s,int [] a) throws IOException {
        File salida  = new File(s);
        salida.createNewFile();
        FileWriter escritor = new FileWriter(salida);
        BufferedWriter bw=new BufferedWriter(escritor);

        bw.write(Integer.toString(a[0]));
        bw.write(" ");
        bw.write(Integer.toString(a[1]));
        bw.close();

    }
}
