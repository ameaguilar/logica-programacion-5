# Diccionario Español-Inglés

## Índice

- [Explicación de la ejecución](#explicación-de-la-ejecución)
- [Explicación del programa](#explicación-del-programa)
- [Estructura de carpetas, paquetes y clases](#estructura-de-carpetas-paquetes-y-clases)
  - [DiccionarioApp](#diccionarioapp)
  - [Juego](#juego)
  - [Consola](#consola)
  - [Diccionario](#diccionario)

## Explicación de la ejecución

1. Abre en IntelliJ IDEA la carpeta del proyecto `Diccionario` (la carpeta que contiene `pom.xml`).
2. Espera a que IntelliJ importe y configure el proyecto Maven.
3. Abre `src/main/java/DiccionarioApp.java`.
4. Ejecuta el método `main` de `DiccionarioApp`, por ejemplo, con el botón de ejecución junto al método.
5. Responde en la consola a las cinco palabras que aparezcan.

El proyecto está configurado para compilar con Java 21.
## Explicación del programa

Este programa es un juego de traducción de español a inglés. El mini diccionario contiene 20 palabras o expresiones:

| Español | Inglés |
| --- | --- |
| programación | programming |
| ordenador | computer |
| teclado | keyboard |
| pantalla | screen |
| ratón | mouse |
| archivo | file |
| carpeta | folder |
| contraseña | password |
| usuario | user |
| servidor | server |
| red | network |
| base de datos | database |
| código | code |
| software | software |
| hardware | hardware |
| aplicación | application |
| desarrollo | development |
| seguridad | security |
| nube | cloud |
| inteligencia artificial | artificial intelligence |

Las palabras y sus traducciones se guardan como pares clave-valor en un `HashMap<String, String>`. La clave es la palabra en español y el valor es su traducción al inglés.

Al iniciar, el programa mezcla al azar las palabras en español y selecciona cinco. Para cada una, solicita al usuario la traducción en inglés y compara la respuesta con la traducción esperada. La comparación ignora mayúsculas y minúsculas y espacios al inicio o al final. Al terminar, muestra cuántas respuestas fueron correctas e incorrectas y el total de preguntas.


## Estructura de carpetas, paquetes y clases

```text
Diccionario/
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── DiccionarioApp.java
            ├── com/
            │   └── programa/
            │       ├── Diccionario.java
            │       └── Juego.java
            └── consola/
                └── Consola.java
```

### DiccionarioApp

Es el punto de entrada del programa. Su método `main` crea el diccionario y la consola, los entrega al objeto `Juego` y llama a `iniciarJuego()` para comenzar.

### Juego

`Juego` coordina el flujo del juego y recibe un objeto `Diccionario` y un objeto `Consola` mediante su constructor. Sus responsabilidades son:

1. Iniciar el juego y dar la bienvenida.
2. Solicitar al diccionario cinco palabras aleatorias.
3. Recorrer las palabras seleccionadas, pedir cada traducción y comprobarla.
4. Contabilizar aciertos y errores, y mostrar el resumen final mediante la consola.

La respuesta se compara con `equalsIgnoreCase` después de aplicar `trim()`, por lo que se aceptan diferencias de mayúsculas y minúsculas y espacios sobrantes en los extremos.

### Consola

`Consola` se encarga de la interacción por terminal:

- `mostrarMensaje` imprime mensajes, como la bienvenida.
- `solicitarRespuesta` muestra una pregunta, lee una línea escrita por el usuario con `Scanner` y la devuelve a `Juego`.
- `mostrarResultados` presenta el número de respuestas correctas, incorrectas y el total de preguntas.

Así, `Juego` puede enfocarse en las reglas y el conteo, mientras `Consola` gestiona la entrada y salida de texto.

### Diccionario

`Diccionario` almacena y selecciona las palabras y traducciones. En su inicialización crea un `HashMap<String, String>` y agrega los 20 pares. `HashMap` permite asociar cada palabra española con su traducción.

El método `obtenerPalabrasAleatorias(int cantidad)` hace lo siguiente:

1. Obtiene las claves del `HashMap` (las palabras en español) y las copia a una `List<String>` (`ArrayList`).
2. Usa `Collections.shuffle` para mezclar aleatoriamente el orden de esa lista.
3. Toma la cantidad solicitada de palabras y consulta sus traducciones en el mapa original.
4. Guarda los pares seleccionados en un nuevo `HashMap` y lo devuelve a `Juego` como `Map<String, String>`.

El tipo `Map` se usa como interfaz para representar los pares clave-valor que el método devuelve; `HashMap` es la implementación concreta que se utiliza para almacenarlos. En el juego se solicitan cinco palabras, por lo que se esperan cinco preguntas.



