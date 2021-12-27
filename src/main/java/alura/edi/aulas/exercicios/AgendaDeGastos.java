package alura.edi.aulas.exercicios;

public class AgendaDeGastos
{
    private String item;
    private int quantidade;
    private double dinheiroMes;
    private double gastos;
    private boolean aberta;
    private Pessoa dona;

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        if (this.isAberta())
            this.item = item;
        else
            System.out.println("Abra a agenda para poder anotar");
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        if (this.aberta)
            this.quantidade = quantidade;
        else
            System.out.println("Abra a agenda para poder anotar");
    }

    public double getDinheiroMes()
    {
        return dinheiroMes - (this.gastos * this.quantidade);
    }

    public void setDinheiroMes(double dinheiroMes)
    {
        this.dinheiroMes = dinheiroMes;
    }

    public double getGastos()
    {
        return gastos;
    }

    public void setGastos(double gastos)
    {
        if (this.isAberta())
            this.gastos = gastos;
        else
            System.out.println("Abra a agenda para poder anotar");
    }

    public boolean isAberta()
    {
        return aberta;
    }

    public void setAberta(boolean aberta)
    {
        this.aberta = aberta;
    }

    public Pessoa getDona()
    {
        return dona;
    }

    public void setDona(Pessoa dona)
    {
        this.dona = dona;
    }
    
    

}
