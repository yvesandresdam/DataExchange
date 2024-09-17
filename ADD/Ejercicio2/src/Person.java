public class Person {
    protected String name;
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

    public void setAge(int value) throws IndexOutOfBoundsException {
        if (value < 0 || value > 120)
            age = value;
        else
            throw new IndexOutOfBoundsException();
    }

    public void displayData() {
        System.out.println("El nombre de la persona es: " + name);
        System.out.println("La edad de la persona es: " + age);
    }
}
