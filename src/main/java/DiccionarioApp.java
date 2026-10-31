import com.programa.Diccionario;
import com.programa.Juego;
import consola.Consola;

public class DiccionarioApp {
    public static void main (String [] args){

    //Crear los objetos
        Diccionario diccionario = new Diccionario();
        Consola consola = new Consola();

    //Crear el juego
        Juego juego = new Juego(diccionario, consola);

    // Iniciar el juego
        juego.iniciarJuego();

    }//main
}//class DiccionarioApp
