package Class16;

public class Task6 {
    char getGrade(int score){
        if (score>90){
            return 'A';
        }else if (score>80){
            return 'B';
        } else if (score>70) {
            return 'C';
        }else if (score>50){
            return 'D';
        }else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Task6 task6=new Task6();
        System.out.println(task6.getGrade(95));
    }
}
