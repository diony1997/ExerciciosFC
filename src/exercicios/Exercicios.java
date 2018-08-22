package exercicios;

import java.util.Scanner;

public class Exercicios 
{

    //Exercicio 1, recebe o salario e a data inicial
    public static void salario(double salario, int ano) 
    {
        double porc = 1.5;
        int aux = 2018 - ano;
        for (int i = 0; i < aux - 1; i++) 
        {
            porc = porc * 2;
        }
        System.out.println("salario Atual: $" + (salario + (salario * porc / 100)));
    }

    //Exercicio 2, recebe o valor inicial e o final, retorna os valores primos
    //pressupondo que o usuario ira digitar os valores de acordo com enunciado
    public static void numPrimos(int comeco, int fim) 
    {
        int aux = comeco, cont = 0;
        String saida = "";
        while (aux <= fim) 
        {
            for (int i = 1; i <= aux; i++) 
            {
                if (aux % i == 0)
                {
                    cont++;
                }
            }
            if (cont == 2) 
            {
                saida += aux + " ";
            }
            cont = 0;
            aux++;
        }
        System.out.println(saida);
    }

    //Exercicio 3, calcula o salario com o numero de horas e o salario minimo
    public static double salarioFinal(double horas, double salario)
    {
        double resultado = horas * (salario / 10);
        return resultado - (resultado * 3 / 100);
    }

    //Exercicio 4, é tudo realizado no metodo
    //recebe um tamanho e devolve a quantidade de tinstas e o valor
    public static void valorTintas() 
    {
        Scanner in = new Scanner(System.in);
        int quantidade;
        System.out.println("Insira o tamanho da area(m²)");
        double tamanho = in.nextDouble();

        quantidade = (int) (tamanho / 54);
        if (tamanho % 54 != 0) 
        {
            quantidade++;
        }
        System.out.println("Serão necessarias: " + quantidade + " latas, custanto " + quantidade * 80 + " reais");

    }

    //Exercicio 6, como pediu apenas para criar um objt, o metodo apenas cria e retorna um com os valores inseridos
    public static Retangulo criadorR() 
    {
        Scanner in = new Scanner(System.in);
        double ladoA, ladoB;
        System.out.println("Insira o comprimento do retângulo");
        ladoA = in.nextDouble();
        System.out.println("Insira a largura do retângulo");
        ladoB = in.nextDouble();
        return new Retangulo(ladoA, ladoB);
    }

    public static void main(String[] args) 
    {
//        salario(1000, 2005);
//        numPrimos(1, 47);
//        System.out.println(salarioFinal(10, 1000));
//        valorTintas();

        Retangulo novo = criadorR();

    }

}
