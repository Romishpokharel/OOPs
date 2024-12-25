import java.util.Scanner;
public class Wrapper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        Integer a;
        a=sc.nextInt();
        String myString=a.toString();
        System.out.println(myString.length());



    }


}

