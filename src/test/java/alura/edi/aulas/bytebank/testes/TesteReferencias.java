package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TesteReferencias
{
    public static void main(String[] args)
    {
        Conta c1 = new Conta();
        // c1 � vari�vel de refer�ncia
        // h� quem chame c1 de 'uma vari�vel do tipo conta'

        c1.deposita(100000);
        System.out.printf("Saldo da conta 1:  %.2f \n", c1.getSaldo());

        Conta c2 = c1;
        // vai copiar tudo o que tem nas vari�veis de de c1 para c2
        // � como outra flecha para o mesmo objeto
        // � como duas cartas para o mesmo endere�o
        System.out.printf("Saldo da conta 2:  %.2f \n", c2.getSaldo());

        // Por fererenciar o MESMO objeto, se eu alterar o valor do saldo de c2, refletir� em c1
        c2.deposita(100);
        System.out.println(c1.getSaldo());

        if (c1.getSaldo() == c2.getSaldo())
        {
            System.out.println("Se trata da mesma conta");
        }
        else
        {
            System.out.println("Contas diferentes");
        }
        
        System.out.println("C1 E C2 S�O O MESMO OBJETO");
        
        System.out.println(c1);
        System.out.println(c2);

    }
}
