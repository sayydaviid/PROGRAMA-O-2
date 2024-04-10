public class Boleto {
    private double valor;
    private String codigodebarras;
    private String vencimento;


    //construtor -> metodo especial
    // as caracteristicas dizem que so pode ser chamado uma vez durante a instanciação, e nao tem retorno,
    // alem de precisar ter o mesmo nome da classe
    // pesquisar o que é um construtor privado
    public Boleto(double valor, String codigodebarras,String vencimento){
        this.valor = valor;
        this.vencimento = vencimento;
        this.codigodebarras = codigodebarras;


    }


    public void emitirBoleto(){
        System.out.println("Emitindo novo boleto:" + valor +"," + vencimento + "," + codigodebarras);
        //Boleto variavelBoleto = new Boleto(valor,vencimento,codigodebarras);
    System.out.println(new Impressao());
    new Impressao().imprimir(this);
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
