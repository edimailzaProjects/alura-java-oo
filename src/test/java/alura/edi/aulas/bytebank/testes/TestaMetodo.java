package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TestaMetodo
{

    public static void main(String[] args)
    {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.printf("Saldo atual Conta de Origem: R$ %.2f \n", conta.getSaldo());
        conta.deposita(100);
        boolean temDinheiro = conta.saca(10);
        System.out.println("Tem dinheiro na conta? " + temDinheiro);

        Conta destino = new Conta();
        destino.deposita(100);

        if (conta.transfere(destino, 100))
        {
            System.out.println("Transferência bem sucedida");
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }

    }

}
