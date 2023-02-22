package Jugador_Ganador;

import java.util.Arrays;

public class AnalizadorGanador {




    public  int[] Analizador (String [] entradas){
        int [] Resultado_Ganador = new  int [2];
        int j_1= 0;
        int j_2= 0;
        int dif_Mayor = 0;
        int dif = 0;
        int ganador= 0;
        for (int i = 0 ;i<entradas.length;i++){

            String [] arry = entradas[i].split(" ");
            j_1 = j_1+ Integer.parseInt(arry[0]);
            j_2 = j_2+ Integer.parseInt(arry[1]);

            dif=j_1-j_2;
            if (dif <0)
                dif = dif * -1;


            if (dif>dif_Mayor) {
                dif_Mayor = dif;
                if (j_1>j_2 || j_1==j_2){
                    ganador = 1;
                }else {
                    ganador = 2;
                }
            }
            Resultado_Ganador= new int[]{ganador, dif_Mayor};


        }
        return Resultado_Ganador;
    }

}
