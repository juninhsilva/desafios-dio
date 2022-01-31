using System;

namespace SucessorPar
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());
            Console.WriteLine(x % 2 == 0 ? x + 2 : x + 1);
        }
    }
}
