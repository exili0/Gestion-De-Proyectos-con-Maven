package com.utad.dawe.app;

import com.utad.dawe.model.JugadorBalonMano; //!!!

public class Equipo {
    public static void main(String[] args) {
        JugadorBalonMano j1 = new JugadorBalonMano("Nico", 3);
        JugadorBalonMano j2 = new JugadorBalonMano("Sergio", 12);

        // Simulación de jornadas
        int jornadasTotales = 10;
        for (int jornada = 1; jornada <= jornadasTotales; jornada++) {
            j1.setAnotacion(jornada * 2);
            j1.setBloqueo(jornada);
            j1.setTiempoJugado(jornada * 300);
            //
            j2.setAnotacion(jornada * 3);
            j2.setBloqueo(jornada + 1);
            j2.setTiempoJugado(jornada * 280);
            //
            System.out.println("|| Jornada " + jornada);
            System.out.println(j1);
            System.out.println(j2);
            // Mostrar estadisticas en la jornada 5 y 10
            if (jornada == 5 || jornada == 10) {
                System.out.println("//////// Estadísticas de la Jornada " + jornada + " ////////");
                System.out.println(j1);
                System.out.println(j2);
            }
        }
    }
}
