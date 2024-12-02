using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicios
{
    class Program
    {
        static void Main(string[] args)
        {
            Alumno1();
            Alumno2();
            Console.WriteLine("Todos los alumnos han terminado el examen");
            Console.ReadKey();
        }


        static void Alumno1()
        {
            Random r = new Random();
            Console.WriteLine("A1: Empiezo el examen");
            Task.Delay(r.Next(2000)).Wait();
            Console.WriteLine("A1: Tengo dudas...");
            Task.Delay(r.Next(2000)).Wait();
            Console.WriteLine("A1: Confiaré en mi intuición...");
            Task.Delay(r.Next(2000)).Wait();
            Console.WriteLine("A1: Entrego el examen...");
        }

        static void Alumno2()
        {

            Random r = new Random();
            Console.WriteLine("A2: Empiezo el examen");
            Task.Delay(r.Next(2000)).Wait();
            Console.WriteLine("A2: Tengo dudas...");
            Task.Delay(r.Next(2000)).Wait();
            Console.WriteLine("A2: Confiaré en mi intuición...");
            Task.Delay(r.Next(2000)).Wait();
            Console.WriteLine("A2: Entrego el examen...");

        }

    }
}
