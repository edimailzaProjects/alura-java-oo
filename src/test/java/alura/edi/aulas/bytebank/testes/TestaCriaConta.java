package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TestaCriaConta
{
    public static void main(String[] args)
    {
        Conta conta1 = new Conta();
        
        conta1.deposita(10);
        conta1.setNumero(1111);
        conta1.setAgencia(11);

        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getNumero());
        System.out.println(conta1.getAgencia());
        System.out.println(conta1.getTitular());

        Conta conta2 = new Conta();

        conta2.deposita(20);
        conta2.setNumero(2222);
        conta2.setAgencia(22);

        System.out.println(conta2.getSaldo());
        System.out.println(conta2.getNumero());
        System.out.println(conta2.getAgencia());
        System.out.println(conta2.getTitular());
    }

}
