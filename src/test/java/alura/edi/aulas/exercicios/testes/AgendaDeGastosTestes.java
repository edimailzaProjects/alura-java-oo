package alura.edi.aulas.exercicios.testes;

import alura.edi.aulas.exercicios.AgendaDeGastos;

public class AgendaDeGastosTestes
{
    public static void main(String[] args)
    {
        AgendaDeGastos agenda = new AgendaDeGastos();
        agenda.setAberta(true);
        
        System.out.println("Dinheiro do m�s: " + agenda.getDinheiroMes());
        
        agenda.setItem("Escova e hidrata��o");
        agenda.setQuantidade(2);
        agenda.setGastos(40);
        
        
        System.out.println(agenda.getQuantidade() + " --- " + agenda.getItem() + " --- Total: " + agenda.getGastos());
        System.out.println("Dinheiro atual: " + agenda.getDinheiroMes());
    }


}
