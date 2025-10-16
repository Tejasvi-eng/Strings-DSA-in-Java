import java.util.*;
public class PrintChar{
    public static void  PrintAllChar(String s) {
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input String:");
        String s=sc.nextLine();
        PrintAllChar(s);
    }

}
