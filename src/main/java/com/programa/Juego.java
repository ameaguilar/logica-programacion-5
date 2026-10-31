package com.programa;

import consola.Consola;
import java.util.Map;
import java.util.Scanner;

public class Juego {

    private Diccionario diccionario;
    private Consola consola;

    public Juego(Diccionario diccionario, Consola consola) {
        this.diccionario = diccionario;
        this.consola = consola;
    }//constructor

    public void iniciarJuego(){

        int correctas = 0;
        int incorrectas = 0;

        consola.mostrarMensaje("Bienvenido al programa de traducción");

        Map<String, String> palabras = diccionario.obtenerPalabrasAleatorias(5);

        for (Map.Entry<String,String> palabra : palabras.entrySet()) { //recorre el HashMap

            String palabraEspanol = palabra.getKey();
            String traduccionCorrecta = palabra.getValue();

            String respuesta = consola.solicitarRespuesta(
                    "Traduce la sigueinte palabra: " + palabraEspanol
            );

            if (respuesta.trim().equalsIgnoreCase(traduccionCorrecta)) {
                correctas++;
                System.out.println("Respuesta correcta");
            } else {
                incorrectas++;
                System.out.println("Respuesta incorrecta, la traducción es: " + traduccionCorrecta);
            }//else
        }//if

        consola.mostrarResultados(correctas, incorrectas);

    }//for


}//class Juego
