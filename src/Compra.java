public class Compra implements Comparable<Compra> { //IMPLEMNETAR PARA COMPARAR VARIAS COMPRAS Continuación de clase principal
    //IMPLEMENTAMOS EL MÉTODO CLIC DERECHO PARA DAR OPCION A @Override
    private double valor;
    private String descripción;


    public Compra(double valor, String descripción) {
        this.valor = valor;
        this.descripción = descripción;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripción() {
        return descripción;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripción='" + descripción;


    }
//PARA HACER LA COMPARACIÓN EN COMPARETO colocar otraCompra para comparar ambos objetos
    @Override
    public int compareTo(Compra otraCompra) {
        //HACER UN CAST PARA LA COMPARACIÓN y para otraCompra esto se hace escribiendo Double con D MAYUSCULA
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
