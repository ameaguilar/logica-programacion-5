package com.programa;

import java.util.*;

public class Diccionario {

    private HashMap<String, String> palabras; // el atributo para esta clase es un HM

    public Diccionario() {
        palabras = new HashMap<>();
        inicializarDiccionario();
    }//constructor

    private void inicializarDiccionario() {
        palabras.put("programación", "programming");
        palabras.put("ordenador", "computer");
        palabras.put("teclado", "keyboard");
        palabras.put("pantalla", "screen");
        palabras.put("ratón", "mouse");
        palabras.put("archivo", "file");
        palabras.put("carpeta", "folder");
        palabras.put("contraseña", "password");
        palabras.put("usuario", "user");
        palabras.put("servidor", "server");
        palabras.put("red", "network");
        palabras.put("base de datos", "database");
        palabras.put("código", "code");
        palabras.put("software", "software");
        palabras.put("hardware", "hardware");
        palabras.put("aplicación", "application");
        palabras.put("desarrollo", "development");
        palabras.put("seguridad", "security");
        palabras.put("nube", "cloud");
        palabras.put("inteligencia artificial", "artificial intelligence");
    }

    //Seleccionar palabras aleatorias
    public Map<String, String> obtenerPalabrasAleatorias(int cantidad){

        List<String> listaPalabras = new ArrayList<>(palabras.keySet());

        Collections.shuffle(listaPalabras); // mezcla aleatoriamente los elementos de nuestra lista

        Map<String, String> palabrasSeleccionadas = new HashMap<>();  //Nuevo HM para guardar las palabras mezcladas

        for( int i = 0; i < cantidad; i++ ){ //recorre nueva lista
            String palabra = listaPalabras.get(i);

            palabrasSeleccionadas.put(palabra, palabras.get(palabra)); //asigna a cada palabra de la nueva lista su traduccion a un nuevo HM
        }//for

        return palabrasSeleccionadas;
    }//metodo obtenerPalabrasAleatorias
}//class Diccionario
