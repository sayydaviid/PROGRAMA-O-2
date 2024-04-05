public class Boleto {
    private double valor;
    private String codigodebarras;
    private String vencimento;
    public void emitirBoleto(double valor,
    String codigodebarras,
    String vencimento){
        System.out.println("Emitindo novo boleto:" + valor +"," + vencimento + "," + codigodebarras);
        Boleto variavelBoleto = new Boleto();
        variavelBoleto.valor = valor;
        variavelBoleto.vencimento = vencimento;
        variavelBoleto.codigodebarras = codigodebarras;
    System.out.println(new Impressao());
    new Impressao().imprimir(variavelBoleto);
    }
public String Lercodigodebarras(){
       return codigodebarras;}
public double lervalor(){
    return valor;}
public String lervencimento(){
        return vencimento;}
public void AlterarValorAposVencimento(int juros){
    valor = valor + 10 + juros;
}
    public void cancelarBoleto(){}

    public void receberBoleto(){}
}
