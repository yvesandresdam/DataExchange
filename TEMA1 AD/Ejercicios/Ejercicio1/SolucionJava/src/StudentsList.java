import java.util.List;

public class StudentsList {

    // Listas
    private List<Student> studentsList;

    // Arrays
    private Student[] studentsArray = new Student[5];

    public void addStudent(Student student) {
        if (student != null)
            studentsList.add(student);
        else
            return;
    }

    public Student getStudentAt(int index) {
        if (index > 0 && index < studentsList.size())
            return studentsList.get(1);
        else {
            System.out.println("El índice esta fuera de rango");
            return null;
        }
    }

    public Student getStudentAtArray(int index) {
        if (index > 0 && index < studentsList.size())
            return studentsArray[index];
        else {
            System.out.println("El índice esta fuera de rango");
            return null;
        }
    }

    public double getStudentsMarkAverage() {
        double average = 0.0;
        for (int i = 0; i < studentsList.size(); i++) {
            average += studentsList.get(i).getMark();
        }
        return average / studentsList.size();
    }
}
