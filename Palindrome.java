import java.util.*;

public class Palindrome {
    public static boolean IsPalindrome(String s){
        int n=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        
        if(IsPalindrome(s)){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Is not a Palindrome");
        }
    }
    
}
    

