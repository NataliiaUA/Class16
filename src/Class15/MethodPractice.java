package Class15;

public class MethodPractice {


    boolean isEven(int num) {
        boolean flag;
        if (num % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    boolean isEven1(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEven2(int num) {
        return num % 2 == 0;
    }
}