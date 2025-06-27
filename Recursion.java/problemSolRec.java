import java.util.*;
public class problemSolRec {

    public static void decreaseNum(int n){
        if (n==1){
            System.out.println(n);
            return;
        } 
        System.out.print(n+" ");
        decreaseNum(n-1);

    }
    public static void increaseNum(int n){
        if (n==1) {
            System.out.println(n+" ");
            return;
            
        }
      increaseNum(n-1);
      System.out.print(n+" ");
    }
    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
       

        return n*factorial(n-1);
    } 
    public static int sumOfNatural(int n){
        if (n==0) {
            return 0;
            
        }
        return n+sumOfNatural(n-1);
    }
    public static int fibbonaci(int n){
        if (n==0||n==1) {
            return n;
            
        }
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
    public static boolean sortedArray(int arr[], int i){
        if (i==arr.length-1) {
            return true;
            
        }
      if (arr[i]>arr[i+1]) {
        return false;

      }
      return sortedArray(arr, i+1);
    }
    public static int firstOccurence(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key){
            return i;
            
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[], int i, int key){
        if (i==arr.length) {
            return -1;
            
        }
        int isFound = lastOccurence(arr, i+1, key);
        if (isFound==-1 && arr[i]==key) {
            return i;
            
        }
        return isFound;
    }
    public static int power(int x,int n){
        if (n==1) {
            return x;
            
        }
        return x*power(x, n-1);
    }
    public static void removeDuplicate(String str, int idx,  StringBuilder newString, boolean map[]){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
            
        }
        char currchar = str.charAt(idx);
        if (map[currchar-'a'] ==true) {
            removeDuplicate(str, idx+1, newString, map);
        }   
       else{
        map[currchar-'a']=true;
        removeDuplicate(str, idx, newString.append(currchar), map);
       }
    }
public static int friendsInPair(int n){
       if (n==1||n==2) {
        return n;
       }
    return friendsInPair(n-1)+(n-1)*friendsInPair(n-2);
}
public static void binaryInString(int n, int lastPlace, String str){
    if (n==0) {
        System.out.println(str);
        return;
    }
    binaryInString(n-1, 0, str+"0");
    if (lastPlace==0) {
        binaryInString(n-1, 1, str+"1");
    }
}
    public static void main(String[] args) {
        int n = 3;
        binaryInString(n, 0, " ");
       // System.out.println(friendsInPair(3));
        //   String str = "appnaacollege";
        // removeDuplicate(str, 0, new StringBuilder(" "), new boolean[26]);
        // int x = 2;
        // int n =10;
        // System.out.println(power(x, n));
        // int arr[] = {1,2,3,4,5,3};
        // int i;
        // int key = 3;
        //System.out.println(lastOccurence(arr, 0, key));
        //System.out.println(firstOccurence(arr, key, 0));
        //System.out.println(sortedArray(arr, 0));
        // int n = 5;
        // System.out.println(fibbonaci(5));
       // System.out.println(sumOfNatural(n));
        //System.out.println(factorial(n));
        //increaseNum(n);
      // decreaseNum(n);
    }
}
