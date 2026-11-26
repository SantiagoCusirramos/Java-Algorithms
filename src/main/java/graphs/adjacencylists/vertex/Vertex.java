package graphs.adjacencylists.vertex;

import graphs.adjacencylists.edge.Edge;
import graphs.exceptions.ExceptionIsEmpty;
import graphs.linkedlist.LinkedList;
import graphs.linkedlist.Node;

public class Vertex<E> {
    private E data;
    private LinkedList<Edge<E>> listAdj; // estos son los que siguen - este usa los edge, osea en si el peso y la referencia
    private boolean visited;

    public Vertex(E data) {
        this.data = data;
        this.listAdj = new LinkedList<Edge<E>>();
        this.visited = false;
    }

    public E getData() {
        return data;
    }

    public LinkedList<Edge<E>> getListAdj() {
        return listAdj;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean equals(Object o){
        if (o instanceof Vertex<?>) {
            Vertex<E> v = (Vertex<E>) o;
            return this.data.equals(v.getData());
        }
        return false;
    }

    public String toString(){
        return this.data + "-->" + this.listAdj.toString() + "\n";
    }

}