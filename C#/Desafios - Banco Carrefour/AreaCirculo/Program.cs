using System;

class Classe
{
    static void Main(string[] args)
    {
        //insira o calculo da area de acordo com o solicitado
        double raio = double.Parse(Console.ReadLine());
        double PI = 3.14159;
        double area = Math.Pow(raio, 2) * PI;
        Console.WriteLine($"A={String.Format("{0:0.0000}", area)}");
    }
}