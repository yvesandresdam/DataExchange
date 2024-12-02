using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicios
{
    class Program
    {
        static async Task Main(string[] args)
        {
            Task alumno1 = Alumno1();
            Task alumno2 = Alumno2();

            await alumno1;
            await alumno2;

            Console.WriteLine("Todos los alumnos han terminado el examen");
            Console.ReadKey();
        }


        static async Task Alumno1()
        {
            Random r = new Random();
            Console.WriteLine("A1: Empiezo el examen");
            await Task.Delay(r.Next(2000));
            Console.WriteLine("A1: Tengo dudas...");
            await Task.Delay(r.Next(2000));
            Console.WriteLine("A1: Confiaré en mi intuición...");
            await Task.Delay(r.Next(2000));
            Console.WriteLine("A1: Entrego el examen...");
        }

        static async Task Alumno2()
        {
            Random r = new Random();
            Console.WriteLine("A2: Empiezo el examen");
            await Task.Delay(r.Next(2000));
            Console.WriteLine("A2: Tengo dudas...");
            await Task.Delay(r.Next(2000));
            Console.WriteLine("A2: Confiaré en mi intuición...");
            await Task.Delay(r.Next(2000));
            Console.WriteLine("A2: Entrego el examen...");
        }
    }
}
