
package alura.edi.aulas.bytebank;

public class Conta
{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    // Contrutor é rotina de inicialização
    // posso inicializar a conexão com um banco de dados
    public Conta()
    {

        System.out.println("Criando uma conta");
        // posso inicializar os atributos
        this.saldo = 100;
    }

    public Conta(int agencia, int numero)
    {
        total++; // está em itálico porque não é do ojeto e sim da classe
        //System.out.println("Total de contas criadas: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta: " + this.numero);
    }

    public double getSaldo()
    {
        return saldo;
    }

    // Desnecessário, pois no mundo real, o método deposita já atende essa condição
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
            System.out.println("O valor da agência não deve ser negativo");
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
            System.out.println("O número da conta não deve ser negativo");
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
            System.out.println("Valor inválido.");
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
            System.out.printf("Saldo da conta origem após transferência: R$ %.2f \n", saldoContaOrigem);

            double saldoContaDestino = contaDestino.getSaldo();
            System.out.printf("Saldo atual da conta destino: R$ %.2f \n", saldoContaDestino);

            saldoContaDestino += valor;
            System.out.printf("O novo saldo da conta destino é R$ %.2f \n", saldoContaDestino);
            return true;
        }
        else
            System.out.println("Saldo insuficiente para transferência");
        return false;
    }

    public static int getTotal()
    {
        return Conta.total;
    }

}
