using System;

namespace DIO
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());
            do
            {
                int total = 0;

                if (x != 0)
                {
                    if (x % 2 != 0)
                    {
                        x += 1;
                    }
                    else
                    {
                        for (int j = x; j <= x + 8; j += 2)
                        {
                            total += j;
                        }
                        Console.WriteLine(total);
                        x = int.Parse(Console.ReadLine());
                    }
                }
                else
                {
                    Console.WriteLine(0);
                }
            } while (x != 0);
        }
    }
}