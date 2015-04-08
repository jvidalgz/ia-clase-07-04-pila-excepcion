/**
 * Created by jaime on 07-04-2015.
 */
public class PilaDinamica<T> {

    private Nodo<T> cima;

    public PilaDinamica() {
        cima = null;
    }

    public void apilar(T x) {
        Nodo<T> nuevoElemento = new Nodo<T>(x);
        Nodo<T> aux;

        if (cima == null) {
            cima = nuevoElemento;
        } else {
            aux = cima;
            cima = nuevoElemento;
            cima.enlace = aux;
        }
    }

    public Nodo desapilar() throws ExcepcionPilaVacia{
        if (cima != null) {
            Nodo aux = cima;
            cima = cima.enlace;
            return aux;
        }else{
            throw new ExcepcionPilaVacia();
        }

    }

    public Nodo verCima() {
        return cima;
    }

    public String toString() {
        String cadena = "";
        Nodo<T> aux = cima;
        while (aux != null) {
            cadena += aux.info.toString();
            aux = aux.enlace;
        }
        return cadena;

    }
}
