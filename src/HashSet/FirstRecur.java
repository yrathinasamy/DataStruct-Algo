//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]: It should return 2
//Given an array = [2,1,1,2,3,5,1,2,4]: It should return 1
//Given an array = [2,3,4,5]: It should return null
//Given an array = [2,5,5,2,3,5,1,2,4]: return 5 because the pairs are before 2,2

package HashSet;
import java.util.HashSet;

public class FirstRecur{

  private Integer getFirstRecur(int[] arr){
    HashSet<Integer> h = new HashSet<>();
    for (int e: arr){
      if(h.contains(e))
        return e;
      else  
        h.add(e);
    }
    return null;
  }

  public static void main(String[] args){
    int[] arr = {2,5,5,2,3,5,1,2,4};
    FirstRecur f = new FirstRecur();
    System.out.println(f.getFirstRecur(arr));
  }
}