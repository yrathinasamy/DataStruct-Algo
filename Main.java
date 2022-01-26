//Program to check if a vowel is present in the string
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      boolean b = isVowelPresent(str);
      System.out.println("Result is:"+b);
      sc.close();
    }
    
    public static boolean isVowelPresent(String str){
      for (int i = 0; i< str.length(); i++){
          if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i)== 'u' ){
            return true;
          }
      }
     return false;
    }
}


//Write a Java program to demonstrate string reverse with and without StringBuffer class?
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedStr = reverse(str);
        System.out.println("The Reversed String is :"+reversedStr);
    }
    
    public static String reverse(String str){
    String temp = "";
    for(int i = str.length()-1; i >=0 ; i--){
        temp += str.charAt(i);
    }
    return temp;
    }

}

//Write a Java program to demonstrate string reverse with and without StringBuffer class?
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("The Reversed String is :"+sb);
        sc.close();
    }
}


// login to gmail and checking the first email to get the PIN #


Login.feature
--------------

Feature: Verify Login functionality of Gmail


@tags
Scenario: Verify Login
Given the user in login page of Gmail
When User the enters UN and Pass and clicks Logon
Then User should see the home page of Gmail.


Scenario: Verify first email
Given User is in the home page of Gmail
When User clicks the first email
Then User should be able to see the PIN# in the body/subject of the email.

-----------------------


SQL 
Table1: Student : StudentID, StudentName, StudentContact 
Table2: Exam : StudentID, Results, Subject

Output: StudentID, StudentName, Results, Subject

select t1.StudentID, t1.StudentName, t2.Results, t2.Subject
from Table1 t1 join Table2 t2 on 
t1.StudentID = t2.StudentID
order by 1;




