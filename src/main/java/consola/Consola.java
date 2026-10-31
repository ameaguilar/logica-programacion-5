package consola;

import java.util.Scanner;

public class Consola {

    private Scanner sc = new Scanner(System.in);

    //imprime mensajes en consola
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //muestra una pregunta y captura la respuesta del usuario
    public String solicitarRespuesta(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

   //Muestra resumen final
    public void mostrarResultados(int correctas, int incorrectas) {
        System.out.println("=============Resultados del juego ============");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        System.out.println("Total de preguntas: " + (correctas + incorrectas));
    }

}//class Consola
