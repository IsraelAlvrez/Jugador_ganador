package Jugador_Ganador;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       try {
           LectorDeTexto GeneracionArchivo = new LectorDeTexto();
           String[] Archivo_leido = GeneracionArchivo.LectorEntrada(args[0]);

           AnalizadorDeEntradas EntradaAnalizada = new AnalizadorDeEntradas();
           String[] EntradaCorrecta = EntradaAnalizada.AnalizadarEntradaCorrecta(Archivo_leido);


           AnalizadorGanador AnalizadorGanador = new AnalizadorGanador();
           int[] Analizador = AnalizadorGanador.Analizador(EntradaCorrecta);

           CreadorArchivoGanador ArchivoGanador = new CreadorArchivoGanador();
           ArchivoGanador.CreadorSalida(args[1], Analizador);
       }catch (Exception exception){
           System.out.println(exception.getMessage());
       }


    }
}
