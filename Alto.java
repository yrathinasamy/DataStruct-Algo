// int[] = {1,4,6,7,4,1} 
//find duplicate {1,4}

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Integer[] input = {1,4,6,7,4,1};
        List<Integer> listArray =  new ArrayList<Integer>(Arrays.asList(input));
        Set<Integer> setArray = findDuplicate(listArray);
        System.out.println(setArray.toString());
    }
    
    public static Set<Integer> findDuplicate(List<Integer> temp){
        List<Integer> ls = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< temp.size(); i++){
            if(ls.contains(temp.get(i))){
                set.add(temp.get(i));
            }
            ls.add(temp.get(i));
        }
        return set;
    }
}

//input = yuvaraj
//output = reverse... jaravuy


public class MyClass {
    public static void main(String args[]) {
        String str = "Yuvaraj";
        String str1 = reverseString(str);
        System.out.println("The reversed string is: "+ str1);
    }
    
    public static String reverseString(String s){
        char[] ch = s.toCharArray();
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversed += ch[i];
            //System.out.println(reversed);
        }
        return reversed;
    }
}

//Compare 2 strings

public class MyClass {
    public static void main(String args[]) {
        String str1 = "Hi How are you ?";
        String str2 = "hi how are you ?";
        String str3 = "Hi How are you doing?";
    
        if(strCompare(str1, str2)){
            System.out.println("Match");
        } else{
            System.out.println("No Match");
        }
         if(strCompare(str1, str3)){
                  System.out.println("Match");
        } else{
            System.out.println("No Match");
         }
    }
    
    public static boolean strCompare(String s1, String s2){
        if(s1.toLowerCase().equals(s2.toLowerCase())){
            return true;
        }
        else
            return false;
    }
    
}
