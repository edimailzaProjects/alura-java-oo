package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Cliente;
import alura.edi.aulas.bytebank.Conta;

public class TestaBanco
{
    public static void main(String[] args)
    {
        Cliente edi = new Cliente();
        edi.setNome("Edi");
        edi.setCpf("222.22222.22");
        edi.setProfissao("Líder de Testes");

        Conta contaEdi = new Conta();
        contaEdi.setAgencia(1);
        contaEdi.setTitular(edi);
        contaEdi.deposita(-100000);
        
        System.out.println("A cliente: " + contaEdi.getTitular().getNome() + " recebeu: R$" + contaEdi.getSaldo());

        // Outro modo de fazer
        Cliente titularConta = contaEdi.getTitular();
        titularConta.setProfissao("QA Manager");

        System.out.println("Sua profissão é: " + contaEdi.getTitular().getProfissao());

    }

}
