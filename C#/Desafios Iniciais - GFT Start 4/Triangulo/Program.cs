using System;

class Triangulo
{

    static void Main(string[] args)
    {

        double a, b, c;
        string[] valor = Console.ReadLine().Split();
        a = Convert.ToDouble(valor[0]);
        b = Convert.ToDouble(valor[1]);
        c = Convert.ToDouble(valor[2]);

        if (a + b > c && b + c > a && c + a > b)
        {
            double perimetro = a + b + c;
            Console.WriteLine($"Perimetro = {String.Format("{0:0.0}", perimetro)}");
        }
        else
        {
            double area = (a + b) * c / 2;
            Console.WriteLine($"Area = {String.Format("{0:0.0}", area)}");
        }

    }

}