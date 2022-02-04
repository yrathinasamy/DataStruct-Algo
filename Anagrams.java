//Anagrams
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
         String str1 = "Software";
         String str2 = "swearoft";
         
         if(str1.length() != str2.length()){
             System.out.println("Sorry! These are NOT Anagrams!");
         }
         else if(areAnagrams(str1,str2)){
             System.out.println("Wow! These are Anagrams :)");
         }
        else{
            System.out.println("Sorry! These are NOT Anagrams!");
        }
    }
    
    public static boolean areAnagrams(String s1, String s2){
        String s1Fixed = removeUnwanted(s1);
        String s2Fixed = removeUnwanted(s2);
        
        s1Fixed = s1Fixed.toLowerCase();
        s2Fixed = s2Fixed.toLowerCase();
        
        s1Fixed = sort(s1Fixed);
        s2Fixed = sort(s2Fixed);
        
        return s1Fixed.equals(s2Fixed);
    }
    
    protected static String removeUnwanted(String s){
        String temp = "";
        for (int i = 0; i< s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                temp += s.charAt(i);
            }
        }
        return temp;
    }
    
    protected static String sort(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
