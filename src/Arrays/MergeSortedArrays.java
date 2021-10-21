//[0,3,4,15] [12,20]          
//[0,3,4,12,15,20]
//l1+l2 =6
//i =4
//j =1
//k =5
//temp ={0,3,4,12,15}

import java.util.Arrays;

public class MergeSortedArrays {
  private int[] myMerge(int[] arr1, int[] arr2) {
    int l1 = arr1.length;
    int l2 = arr2.length;
    int i=0, j=0, k=0;
    int[] temp= new int[l1+l2];
    while (k < (l1 + l2) && i< l1 && j< l2) {
      if (arr1[i] < arr2[j]) {
        temp[k] = arr1[i];
        i++;
      } else if(arr1[i] == arr2[j]){
          temp[k] = arr2[j];
          j++;
          i++;
      }
      else {
        temp[k] = arr2[j];
        j++;
      }
      k++;
    }
    System.out.println("I = "+i+"; J = "+j+"; K = "+k);
    while (i< l1){
      temp[k] = arr1[i];
      i++;
      k++;
    }
     while (j< l2){
      temp[k] = arr2[j];
      j++;
      k++;
    }
    System.out.println("I = "+i+"; J = "+j+"; K = "+k);
    return temp;
  }

  public static void main(String[] args) {
    MergeSortedArrays m1 = new MergeSortedArrays();
    int[] arr1 = { 0, 3, 4, 15 };
    int[] arr2 = { 4, 20, 25 };
    System.out.println(Arrays.toString(m1.myMerge(arr1, arr2)));

  }

}