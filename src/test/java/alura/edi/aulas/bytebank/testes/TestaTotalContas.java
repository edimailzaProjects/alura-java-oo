package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TestaTotalContas
{
    public static void main(String[] args)
    {
        Conta c1 = new Conta(1,1010);
        Conta c2 = new Conta(1,2020);
        Conta c3 = new Conta(1,3030);
        
        System.out.println(Conta.getTotal());
    }

}
