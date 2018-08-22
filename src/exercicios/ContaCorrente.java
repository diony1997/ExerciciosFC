package exercicios;

public class ContaCorrente 
{

    private int numeroConta;
    private String nome;
    private double saldo;

    //Contrutor completo
    public ContaCorrente(int numeroConta, String nome, double saldo) 
    {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    //construtor sem saldo
    public ContaCorrente(int numeroConta, String nome) 
    {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }
    
    public void alterarNome(String nome)
    {
        this.nome = nome;
    }
    
    public void deposito(double valor)
    {
        saldo +=valor;
    }
    
    public void saque(double valor)
    {
        saldo -=valor;
    }

    //Getters
    public int getNumeroConta() 
    {
        return numeroConta;
    }

    public String getNome() 
    {
        return nome;
    }

    public double getSaldo() 
    {
        return saldo;
    }
         
    
}
