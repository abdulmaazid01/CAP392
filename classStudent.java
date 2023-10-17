class Student {
    String name;
    int[] grades;

    // Constructor
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}

public class classStudent {
    public static void main(String[] args) {
        int[] student1Grades = {85, 90, 78, 92, 88};
        Student student1 = new Student("Alice", student1Grades);

        int[] student2Grades = {75, 82, 95, 88, 70};
        Student student2 = new Student("Bob", student2Grades);

        System.out.println(student1.name + "'s average grade: " + student1.calculateAverage());
        System.out.println(student2.name + "'s average grade: " + student2.calculateAverage());
    }
}
