using System;

namespace SequenciaS
{
    class Program
    {
        static void Main(string[] args)
        {
            double a = 1, c, S = 0;
            for (int i = 1; i <= 100; i++)
            {
                c = a / i;  //coloque a sua lógica nos espaços em branco
                S = S + c;
            }
            Console.WriteLine(Math.Round(S, 2));
        }
    }
}
