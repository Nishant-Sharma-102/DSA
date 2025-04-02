import java.util.*;
public class tcsArrayQuestion {

    
        public static int maxone(int arr[]) {
            int count = 0;
            int maxi = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 1) {
                    count++;
    
                } else {
                    count = 0;
                }
                maxi = Math.max(maxi, count);
            }
            return maxi;
    
        }
    
        public static int[] moveszero(int arr[]) {
            int j = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    j = i;
                    break;
    
                }
            }
            if (j == -1)
                return arr;
    
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
    
                }
    
            }
            return arr;
        }
    
        public static int removedups(int arr[]) {
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    i++;
                    arr[i] = arr[j];
    
                }
            }
            return i + 1;
        }
    
        public static void missingnumber(int arr[],int n) {
              int sonn = (n*(n+1)/2);
             int sum = 0;
             for(int i= 0; i<arr.length; i++){
                sum+=arr[i];
                
             }
             int miss = sonn-sum;
             System.out.println(miss);
        }
        public static int repeatonce(int arr[]){
           
           int xorr = 0;
           for(int i= 0; i<arr.length; i++){
            xorr = xorr^arr[i];
    
           }
            
           return xorr;
        }
        //IMPORTANT PROBLEM IS 2SUM
        
        public static String twosum(int arr[],int target){
           
             int left =0;
             int right = arr.length-1;
             while (left<right) {
                int sum = arr[left]+arr[right];
                if (sum==target) {
                    return "yes";
                    
                }else if (sum<target) {
                    left++;
                    
                }else{
                    right--;
                }
             }
             return "NO";
        }
        public static int findingequilbrium(int arr[]){
            int totalsum = 0;
            for(int i=0; i<arr.length; i++){
                totalsum+=arr[i];
            }
            int leftsum = 0;
            int rightsum = totalsum;
            for(int i=0; i<arr.length; i++){
                rightsum-=arr[i];
            if (leftsum==rightsum) {
                return i;
    
                
            }
            leftsum+=arr[i];
        }
        return -1;
    
        }
        //USE BINARY SEARCH ALGORITHAM
        public static int searcheleinarray(int arr[], int key){
            int start = 0;
            int end = arr.length-1;
            while (start<=end) {
                int mid =(start+end)/2;
                if (arr[mid]==key) {
                    return mid;
                    
                }if (arr[mid]<key) {
                    start = mid+1;
                    
                }else{
                    end = mid-1;
                }
                
            }
            return -1;
        }
    public static boolean arrissubsetof(int arr1[], int m, int arr2[], int n){
        if(m>n) return false;
        for(int i=0; i<m; i++){
            boolean present = false;
            for(int j=0; j<n; j++){
                if (arr2[j]==arr1[i]) {
                    present = true;
                    break;
                    
                }
            }
            if(present==false) return false;
        }
        return true;
    }
    
}