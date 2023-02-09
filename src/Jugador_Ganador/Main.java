package Jugador_Ganador;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("increse la ruta de dode se encuentre su archivo");
        String ruta_entrada = sc.nextLine();


        Lector_de_Texto generacion_archivo = new Lector_de_Texto();
        String[] Archivo_leido = generacion_archivo.Lector_Entrada(ruta_entrada);


        Analizador_Ganador Analizador_ganador = new Analizador_Ganador();
        int[]  Analizador = Analizador_ganador.anlizador(Archivo_leido);



        System.out.println("increse la ruta de donde quiera que se guarde  su archivo");
        String rutasalida = sc.nextLine();
        Creador_Archivo_ganador Archivo_Ganador = new Creador_Archivo_ganador();
        Archivo_Ganador.Creador_salida(rutasalida,Analizador);


    }
}
