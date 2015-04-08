import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by jaime on 07-04-2015.
 */
public class Main {

    public static void main(String[] args) {

        Nodo<Integer> n1 = new Nodo<Integer>(1);
        Nodo<Integer> n2 = new Nodo<Integer>(2);
        Nodo<Integer> n3 = new Nodo<Integer>(3);
        Nodo<Integer> n4 = new Nodo<Integer>(4);
        Nodo<Integer> n5 = new Nodo<Integer>(5);



        PilaDinamica pila = new PilaDinamica<Integer>();

        pila.apilar(n1);
        pila.apilar(n2);
        pila.apilar(n3);
        pila.apilar(n4);
        pila.apilar(n5);

        System.out.println(pila.verCima());
        try {
            System.out.println("Se desapila: " + pila.desapilar());
            System.out.println("Se desapila: " + pila.desapilar());
            System.out.println("Se desapila: " + pila.desapilar());
            System.out.println("Se desapila: " + pila.desapilar());
            System.out.println("Se desapila: " + pila.desapilar());
            System.out.println("Se desapila: " + pila.desapilar());
        } catch (ExcepcionPilaVacia excepcionPilaVacia) {
            System.out.println("La pila está vacía");
        }


    }
}
