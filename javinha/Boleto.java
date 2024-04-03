public class Boleto {
    double valor;
    String codigodebarras;
    String vencimento;
    public void emitirBoleto(){
        System.out.println("Emitindo novo boleto:" + valor +"," + vencimento + "," + codigodebarras); 
    }
       
    public void cancelarBoleto(){}

    public void receberBoleto(){}
}
