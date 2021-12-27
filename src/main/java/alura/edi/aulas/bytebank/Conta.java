
package alura.edi.aulas.bytebank;

public class Conta
{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    // Contrutor � rotina de inicializa��o
    // posso inicializar a conex�o com um banco de dados
    public Conta()
    {

        System.out.println("Criando uma conta");
        // posso inicializar os atributos
        this.saldo = 100;
    }

    public Conta(int agencia, int numero)
    {
        total++; // est� em it�lico porque n�o � do ojeto e sim da classe
        //System.out.println("Total de contas criadas: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta: " + this.numero);
    }

    public double getSaldo()
    {
        return saldo;
    }

    // Desnecess�rio, pois no mundo real, o m�todo deposita j� atende essa condi��o
    // public void setSaldo(double saldo)
    // {
    // this.saldo = saldo;
    // }

    public int getAgencia()
    {
        return agencia;
    }

    public void setAgencia(int agencia)
    {
        if (agencia >= 0)
        {
            this.agencia = agencia;
        }
        else
        {
            System.out.println("O valor da ag�ncia n�o deve ser negativo");
            return;
        }

    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        if (numero >= 0)
        {
            this.numero = numero;
        }
        else
        {
            System.out.println("O n�mero da conta n�o deve ser negativo");
            return;
        }

    }

    public Cliente getTitular()
    {
        return titular;
    }

    public void setTitular(Cliente titular)
    {
        this.titular = titular;
    }

    public void deposita(double valor)
    {
        if (valor >= 1)
        {
            double novoSaldo = this.saldo += valor;
            System.out.printf("Dinheiro depositado: R$ %.2f \n", valor);
            System.out.printf("Saldo atual: R$ %.2f \n", novoSaldo);
        }
        else
        {
            System.out.println("Valor inv�lido.");
            return;
        }

    }

    public boolean saca(double valor)
    {
        if (this.saldo >= valor)
        {
            double novoSaldo = this.saldo -= valor;
            System.out.printf("Dinheiro sacado: R$ %.2f \n", valor);
            System.out.printf("Saldo atual: R$ %.2f \n", novoSaldo);
            return true;
        }
        else
        {
            System.out.println("Saldo insuficiente!");
            return false;
        }

    }

    public boolean transfere(Conta contaDestino, double valor)
    {
        System.out.printf("Saldo atual da conta origem: R$ %.2f \n", this.saldo);
        if (this.saldo >= valor)
        {
            double saldoContaOrigem = this.saldo -= valor;
            System.out.printf("Saldo da conta origem ap�s transfer�ncia: R$ %.2f \n", saldoContaOrigem);

            double saldoContaDestino = contaDestino.getSaldo();
            System.out.printf("Saldo atual da conta destino: R$ %.2f \n", saldoContaDestino);

            saldoContaDestino += valor;
            System.out.printf("O novo saldo da conta destino � R$ %.2f \n", saldoContaDestino);
            return true;
        }
        else
            System.out.println("Saldo insuficiente para transfer�ncia");
        return false;
    }

    public static int getTotal()
    {
        return Conta.total;
    }

}
