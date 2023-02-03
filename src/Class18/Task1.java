package Class18;

public class Task1 {
    Task1(){
        System.out.println("Constructor without any parameter");
    }
    Task1 (String name){
        System.out.println("Constructor with a String parameter");
    }
    Task1(int number){
        System.out.println("Constructor with an int parameter");
    }
    Task1(char c){
        System.out.println("Constructor with an char parameter");
    }
    public static void main (String[]args ){
        Task1 task1=new Task1();
        Task1 task2=new Task1("Java");
        Task1 task3=new Task1(1000);
        Task1 task4=new Task1('G');
    }
}
