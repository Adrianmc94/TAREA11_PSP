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

        // 1. Definir el valor por defecto para el número máximo de hilos.
        int maximoHilos = 5;

        // 2. Intentar leer el argumento de la línea de comandos.
        if (args.length > 0) {
            try {
                // El primer argumento (args[0]) se intenta convertir a entero.
                int n = Integer.parseInt(args[0]);

                // Asegurar que el número de hilos sea al menos 1.
                if (n >= 1) {
                    maximoHilos = n;
                } else {
                    // Si el número es menor a 1, se usa el valor por defecto (5).
                    System.out.println("ADVERTENCIA: El número de hilos debe ser 1 o más. Usando valor por defecto (N=5).");
                }
            } catch (NumberFormatException e) {
                // Si el argumento no es un número válido
                System.out.println("ADVERTENCIA: Argumento inválido. Usando valor por defecto (N=5).");
            }
        } else {
            // Si no se proporciona ningún argumento, se mantiene el valor por defecto
            System.out.println("No se proporcionó argumento. Usando valor por defecto (N=5).");
        }
        System.out.println("Iniciando la cadena de dominó con N=" + maximoHilos + " fichas.");
        // Creamos el primer hilo con el nombre "Hilo-1" y el máximo de hilos calculado.
        // La variable 'maximoHilos' ahora es la longitud de la cadena de dominó.
        Thread primero = new DominioThread("Hilo-1", maximoHilos);

        // Arrancamos el 1er hilo.
        primero.start();
    }
}

