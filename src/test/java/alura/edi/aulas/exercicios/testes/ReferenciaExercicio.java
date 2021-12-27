package alura.edi.aulas.exercicios.testes;

import alura.edi.aulas.exercicios.AgendaDeGastos;

public class ReferenciaExercicio
{
    public static void main(String[] args)
    {
        AgendaDeGastos agenda = new AgendaDeGastos();
        agenda.setAberta(true);

        System.out.println("Dinheiro do mês: " + agenda.getDinheiroMes());

        agenda.setItem("Escova e hidratação");
        agenda.setQuantidade(2);
        agenda.setGastos(40);

        System.out.println("Dinheiro Atual da Agenda 1: " + agenda.getDinheiroMes());

        AgendaDeGastos outraAgenda = agenda;

        System.out.println("Dinheiro atual da mesma Agenda, pois a outra agenda nada mais é do que uma referência: "
                + outraAgenda.getDinheiroMes());
    }

}
