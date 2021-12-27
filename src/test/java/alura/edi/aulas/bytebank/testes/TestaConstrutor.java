package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TestaConstrutor
{
    public static void main(String[] args)
    {
        Conta conta = new Conta(1,10);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }
}
