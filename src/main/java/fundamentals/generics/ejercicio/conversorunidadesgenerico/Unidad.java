package fundamentals.generics.ejercicio.conversorunidadesgenerico;

public class Unidad<T extends Number> {
    private String TipoUnidad;
    private T valor;

    public Unidad(String TipoUnidad, T valor){
        this.TipoUnidad=TipoUnidad;
        this.valor=valor;
    }

    public String getTipo(){ return TipoUnidad; }
    public T getValor(){return valor;}
    public void setTipo(String tipo){this.TipoUnidad=tipo;}
    public void setValor(T valor){this.valor=valor;}
}
