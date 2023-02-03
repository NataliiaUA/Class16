package Class17;

public class Student {
    double id;
    String name;
    int age;
    double weight;

    Student (int studentId, String studentName,
        int studentAge, double studentWeight) {
        id = studentId;
        name = studentName;
        age = studentAge;
        weight = studentWeight;
    }
    void printInfo () {
        System.out.println("Id " + id + " Name " + name + " age " + age + " Weight " + weight);
    }
}

