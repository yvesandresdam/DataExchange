import java.time.LocalDate;

public class Person {

    private static final String FECHA_NACIMIENTO_NO_VALIDA = "Fecha de nacimiento no valida";
    private static final String TELEFONO_NO_VALIDO = "Telefono no valido";
    private static final String SUELDO_NO_VALIDO = "Sueldo no valido";

    protected String name;
    protected LocalDate birthdate;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public int getAge() {
        return age;
    }

    public void setBirthdate(LocalDate birthdate) throws IllegalArgumentException {
        LocalDate currentDate = LocalDate.now();
        if (birthdate.isBefore(currentDate))
            this.birthdate = birthdate;
        else
            throw new IllegalArgumentException("La fecha introducida no es valida");
    }

        public void setAgeAlternative ( int value) throws IndexOutOfBoundsException {
            if (value < 0 || value > 120)
                age = value;
            else
                throw new IndexOutOfBoundsException();
        }

        public void displayData () {
            System.out.println("El nombre de la persona es: " + name);
            System.out.println("La edad de la persona es: " + age);
        }
    }
