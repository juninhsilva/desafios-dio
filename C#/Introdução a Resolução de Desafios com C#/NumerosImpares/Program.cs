using System;

class Program
{

    public static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        for (int i = 1; i <= n; i += 2)
        {
            if (i % 2 == 1)
            {
                Console.WriteLine(i);
            }
        }
    }
}