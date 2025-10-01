package TAREA11;

import java.util.Random;

//Clase que representa la ficha del dominó
public class DominioThread extends Thread {

    //Definimos las variables
    private String nombre; //Nombre del hilo
    private int numero; //para saber en que ficha estamos
    private DominioThread siguiente; //referencia al siguiente hilo
    private int maximo; //numero maximo de fichas
    public static Random random = new Random();

    //Definimos el constructor:
    public DominioThread(String nombre, int maximo) {
        this.nombre = nombre;
        this.maximo = maximo;

        //extraemos el numero del hilo a partir de su nombre
        this.numero = Integer.parseInt(nombre.split("-")[1]);
    }
    //Metodo que ejecuta la lógica del hilo
    public void run() {

        //sino se llega a la ultima ficha (maximo) creamos otra y asi sucesivamente
        if (numero < maximo) {
            siguiente = new DominioThread("Hilo-" + (numero + 1), maximo);
            siguiente.start();
        }
        //bucle de 5 iteraciones
        for (int i = 1; i <= 5; i++) {
            System.out.println("Soy " + nombre + " con la iteración: " + i);

            //pausa aleatoria entre 100 y 600 ms
            try {
                int espera = 100 + random.nextInt(501); //generamos un numero aleatoria entre 100 y 600
                Thread.sleep(espera); //hace que el hilo se duerma la cantidad de tiempo generada antes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Esperar a que el siguiente hilo termine
        if (siguiente != null) {
            try {
                siguiente.join();  // bloquea hasta que el siguiente hilo acabe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Anunciar que acabó
        System.out.println("Acabó " + nombre);
    }
}
