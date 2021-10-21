public class ReverseString {

  private String reverse(String string) {
    String temp = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      temp = temp + (string.charAt(i));
    }
    return temp;
  }

  private String reverse2(String string) {
    StringBuilder temp = new StringBuilder();
    for (int i = string.length() - 1; i >= 0; i--) {
      temp.append(string.charAt(i));
    }
    return temp.toString();
  }

  public static void main(String[] args) {
    ReverseString rString = new ReverseString();
    String string = "Hello";
    if (string == "")
      System.out.println("Hey! Looks like the String is empty");
    else if (string.length() == 1)
      System.out.println("I am going to give you back the same: " + string);
    else {
      System.out.println("Reversed String is: " + rString.reverse(string));
      System.out.println("Reversed String is: " + rString.reverse2(string));
    }
  }

}