import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;


    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>(); //INICIALIZAMOS EL ARREGLO
    }

    //LOGICA PARA AGREGAR UNA NUEVA COMPRA A LISTA DE COMPRAS
    public boolean lanzarCompra(Compra compra){ //CREAR METODO
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;

    }
        return false;
    }


    //CONSTRUIR GETTER Y SETTER

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
