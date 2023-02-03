package Class16;

public class Task5 {
    public static void main (String [] args) {
        int num  = 5;
        boolean flag = true;
        if (num>1){
            for (int i = 2; i < num; i++) {
                if (num%1==0) {
                    flag =false;
                    break;
                }
            }
        }else {
            flag = false;
        }
        System.out.println(num+ "is prime " + flag);
    }
}
