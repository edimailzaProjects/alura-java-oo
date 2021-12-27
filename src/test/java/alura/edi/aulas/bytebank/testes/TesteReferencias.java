package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Conta;

public class TesteReferencias
{
    public static void main(String[] args)
    {
        Conta c1 = new Conta();
        // c1 é variável de referência
        // há quem chame c1 de 'uma variável do tipo conta'

        c1.deposita(100000);
        System.out.printf("Saldo da conta 1:  %.2f \n", c1.getSaldo());

        Conta c2 = c1;
        // vai copiar tudo o que tem nas variáveis de de c1 para c2
        // é como outra flecha para o mesmo objeto
        // é como duas cartas para o mesmo endereço
        System.out.printf("Saldo da conta 2:  %.2f \n", c2.getSaldo());

        // Por fererenciar o MESMO objeto, se eu alterar o valor do saldo de c2, refletirá em c1
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
        
        System.out.println("C1 E C2 SÃO O MESMO OBJETO");
        
        System.out.println(c1);
        System.out.println(c2);

    }
}
