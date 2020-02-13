package BinarySearch;

public class BinarySearchSetup {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int X = 8;
        System.out.println("binary search using recursion");
        int result1 = binarySearchByRecursion(0,arr.length-1,arr,X);
        if(result1<0)
            System.out.println("NOT FOUND");
        else
        System.out.println("result found at index: "+ result1+" and value is: "+ arr[result1]);
        System.out.println("-------------------------------------------------------");
        System.out.println("binary search not using recursion");
        int result2 = binarySearchNotByRecursion(0,arr.length-1,arr,X);
        if(result2<0)
            System.out.println("NOT FOUND");
        else
            System.out.println("result found at index: "+ result2+" and value is: "+ arr[result2]);
    }
    public static int binarySearchByRecursion(int l,int r,int[]arr,int X) {
        int LOC=-1;
        int m;
        if (l > r) {
            return LOC;
        }
        else m = (int) Math.floor((l + r) / 2);

        if (X < arr[m])
            LOC = binarySearchByRecursion(l, m - 1, arr, X);
        else if (X > arr[m])
            LOC = binarySearchByRecursion(m + 1, r, arr, X);
        else
            LOC = m;
      return LOC;
    }

    public static int binarySearchNotByRecursion(int l,int r,int[]arr,int X){
        int LOC = -1;
        int m;
        while (l<=r){
            m = (int) Math.floor((l + r) / 2);
            if (X < arr[m])
                LOC = binarySearchByRecursion(l, m - 1, arr, X);
            else if (X > arr[m])
                LOC = binarySearchByRecursion(m + 1, r, arr, X);
            else
                LOC = m;
            return LOC;
        }
        return LOC;
    }
}
