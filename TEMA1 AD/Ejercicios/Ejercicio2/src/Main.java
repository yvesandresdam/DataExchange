import java.time.LocalDate;
import java.util.Date;

public class Main {
    // EJERCICIO 2
    // MIGRAR C# A JAVA



    public static void main(String[] args) {

        System.out.println("Migrando a JAVA");
        Date date1 = new Date();
        System.out.println(date1);

        LocalDate local1 = LocalDate.now();
        System.out.println(local1);
        local1 = LocalDate.of(2024,10,10);

    }
}


//  CODIGO C#
/*
using System.Collections.Generic;

namespace Ejercicio1
{
    const string FECHA_NACIMIENTO_NO_VALIDA = "Fecha de nacimiento no válida";
    const string TELEFONO_NO_VALIDO = "Teléfono no válido";
    const string SUELDO_NO_VALIDO = "Sueldo no válido";

    class Persona
    {
        //
        private string _nombre;
        private DateTime _fechaNacimiento;

		public string Nombre { get => _nombre; set => _nombre = value; }
		public DateTime FechaNacimiento {
            get => _fechaNacimiento;
            set {
                if (value > DateTime.Today)
                    throw new ArgumentException(FECHA_NACIMIENTO_NO_VALIDA);
                _fechaNacimiento= value;
            }
        }

		public int Edad  => (DateTime.Today - FechaNacimiento).Days / 365);
		}
    }

    class Cliente : Persona
    {
        //
        private string _telefono;
        private Set<Empresa> _esClienteDe = new Set<Empresa>();

		public string Telefono {
            get => _telefono;
        set {
            string patronTelefono = "^((\+|00)\d{2,3})?\d{9}$";
            if (Regex.IsMatch(value, patronTelefono))
                _telefono = value;
            else
                throw new ArgumentException(TELEFONO_NO_VALIDO);
            }
        }
    }

    class Empleado : Persona
	{
		private double _sueldoBruto;

		public double SueldoBruto {
            get => _sueldoBruto;
        set {
            if (value < 0)
                throw new ArgumentException(SUELDO_NO_VALIDO);
            sueldoBruto = value;
            }
        }
	}

	class Directivo : Empleado
    {
        //
        private string _categoria;
        private Set<Empleado> _supervisa = new Set<Empleado>();

		public string Categoria { get => _categoria; set => _categoria = value; }
        public int Subordinados => supervisa.Count;
    }

	//
    class Empresa
    {
        //
        private string _nombre;
        private Set<Empleado> _plantilla = new Set<Empleado>();
        private Set<Cliente> _carteraDeClientes = new Set<Cliente>();

		public string Nombre { get => _nombre; set => _nombre = value; }
        public int ClientesTotales => _carteraDeClientes.Count;
        public int EmpleadosTotales => _plantilla.Count;
    }
}
 */