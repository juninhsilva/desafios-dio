using System;

namespace Desafios
{
    class Tabuada
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int valor = 0;

            for (int i = 1; i <= 10; i++)
            {
                valor = i * n;
                Console.WriteLine($"{i} x {n} = {valor}"); //escreva o seu código nos espaços em branco
            }
        }
    }
}