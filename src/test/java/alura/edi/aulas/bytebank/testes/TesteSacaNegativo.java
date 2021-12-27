package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TesteSacaNegativo
{
    public static void main(String[] args)
    {
        Conta conta = new Conta();
        conta.deposita(10);
        System.out.println("Tem grana? " + conta.saca(100));
        System.out.println(conta.getSaldo() - 11.0);

    }

}
