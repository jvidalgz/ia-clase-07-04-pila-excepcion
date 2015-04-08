/**
 * Created by jaime on 07-04-2015.
 */
public class Nodo<T> {

    public T info;
    public Nodo enlace;

    public Nodo(T info) {
        this.info = info;
        enlace = null;
    }

    @Override
    public String toString() {
        return "#" + info + "#";
    }
}
