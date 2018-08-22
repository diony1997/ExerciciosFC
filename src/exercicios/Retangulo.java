package exercicios;

public class Retangulo 
{

    private double ladoA, ladoB;

    public Retangulo(double ladoA, double ladoB) 
    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

   public void setLadoA(double ladoA)
   {
       this.ladoA = ladoA;
   }
   
   public void setLadoB(double ladoB)
   {
       this.ladoB = ladoB;
   }
   
   public double getladoA()
   {
       return ladoA;
   }
   
   public double getladoB()
   {
       return ladoB;
   }
   
   public double calcularArea()
   {
       return ladoA*ladoB;
   }
   
   public double calcularPerimetro()
   {
       return (2*ladoA)+(2*ladoB);
   }
   
}
