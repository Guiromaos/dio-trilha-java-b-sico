public class Simples {
    public static void main(String[] args) {
        Double saldo = 25.0;
        Double valorSolicitado = 17.0;

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }
}