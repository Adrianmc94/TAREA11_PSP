package TAREA11;

//Clase que representa la ficha del dominó
public class DominioThread extends Thread {

    //Definimos las variables
    private int numero; //para saber en que ficha estamos

    private int maximo; //numero maximo de fichas

    //Definimos el constructor:
    public DominioThread(int numero, int maximo) {
        this.numero = numero;
        this.maximo = maximo;
    }

    //Metodo que ejecuta la lógica del hilo
public void run() {
    //Mensaje al caer la ficha
    System.out.println("Ficha " + numero + " ha caido");

    //sino se llega a la ultima ficha (maximo) creamos otra y asi sucesivamente
    if (numero < maximo) {
        Thread siguiente = new DominioThread(numero + 1, maximo);
        siguiente.start();
    }
}
}

