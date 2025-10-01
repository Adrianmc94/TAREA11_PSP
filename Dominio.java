/*
El objetivo de este nivel es implementar el mecanismo fundamental del efecto
dominó, donde cada hilo "derriba" al siguiente. Para ello:
1. Realizar un programa que cree un hilo, que a su vez cree otro, y así
consecutivamente hasta un total de cinco hilos (fichas).
2. Cada hilo debe cumplir rigurosamente con la siguiente secuencia de
acciones:
2.1. Lanzar al siguiente hilo en la cadena (excepto el último).
2.2. Entrar en un bucle de 5 iteraciones. En cada una, debe imprimir su
nombre y el número de iteración con un formato del estilo: Soy el
hilo [nombre] iteración: [número].
2.3. Esperar un tiempo aleatorio (entre 100 y 600 ms) entre cada
impresión del bucle.
2.4. Tras finalizar su bucle, esperar a que el siguiente hilo termine su
ejecución por completo (simulando que no puede "asentarse" hasta
que el resto de la cadena ha caído).
2.5. Finalmente, anunciar que ha finalizado con el formato del estilo: Acabó
hilo [nombre].
 */

package TAREA11;

public class Dominio {
    public static void main(String[] args) {

    //Creamos el hilo principal
    //Creamos una instancia de DominoThread con número 1 y un máximo 5.
        Thread primero = new DominioThread("Hilo-1",5);

        //Arrancamos el 1er hilo
        primero.start();
    }
}

