package Class16;

public class TaskHW3 {
    void isPalindrome (String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reverseStr=st.toString();
        if (str.equals(reverseStr)) {
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str+ "Not is palindrome");
        }
    }
    public static void main (String [] args) {
        TaskHW3 tast = new TaskHW3();
        //TaskHW3.isPalindrome("kaya");


    }
}
