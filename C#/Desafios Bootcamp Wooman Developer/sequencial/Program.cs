﻿class Program
{
    static void Main(string[] args)
    {
        int i = 1;
        while (i <= 9)
        {
            for (int j = 7; j > 4; j--)
            {
                Console.WriteLine("I=" + i + " J=" + j);
            }
            i += 2;
        }
    }
}
