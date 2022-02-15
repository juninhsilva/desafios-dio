using System;

class Program
{
    static void Main(string[] args)
    {
        string[] v = Console.ReadLine().Split();
        int n = int.Parse(v[0]);
        int l = int.Parse(v[1]);
        Console.WriteLine($"{(n * l)}");
    }
}