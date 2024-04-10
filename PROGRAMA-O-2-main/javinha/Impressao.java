public class Impressao {

    public void imprimir(Boleto variavelBoleto){
        // variavelBoleto.valor = 100;
        System.out.println("Finalmente Imprimindo...!" + variavelBoleto.Lercodigodebarras() + variavelBoleto.lervalor() + variavelBoleto.lervencimento());
    }

    public void escanear(){}

    
    
}
