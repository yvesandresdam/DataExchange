public class Student {

    // ATRIBUTOS
    private String name;
    private int mark;

    // PROPERTIES
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int value) {
        if (value >= 0 && value <= 10)
            mark = value;
        return;
    }

    // METODOS
    public Boolean isApproved() {
        return mark > 4;
    }
}
