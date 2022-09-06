public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);

        if(sucessoTransferencia){
            System.out.println("Transferência com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }

        contaDaMarcela.transfere(500, contaDoPaulo);

        System.out.println(contaDoPaulo.saldo);
    }
}