class Student {
    String name;
    int[] grades;

    // Constructor
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public int calculateTotalSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public double calculateAverage() {
        int sum = calculateTotalSum();
        return (double) sum / grades.length;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] student1Grades = {85, 90, 78, 92, 88};
        Student student1 = new Student("Ziden", student1Grades);

        int[] student2Grades = {75, 82, 95, 88, 70};
        Student student2 = new Student("Abdul", student2Grades);

        System.out.println(student1.name + "'s total sum of grades: " + student1.calculateTotalSum());
        System.out.println(student1.name + "'s average grade: " + student1.calculateAverage());

        System.out.println(student2.name + "'s total sum of grades: " + student2.calculateTotalSum());
        System.out.println(student2.name + "'s average grade: " + student2.calculateAverage());
    }
}
