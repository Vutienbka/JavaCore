package SotrAlgorithm;

// thuat toan insertion sort la lay mot phan tu trong day chen vao vi tri thich hop trong day da sap xep
// bang cach so sanh cac phan tu trong mang co da dc xap xep voi tung phan tu con lai trong day so roi dich chuyen tung phan tu trong mang con day
// de chen phan tu phu hop vao
public class InsertionSort {
    public static void insert(int arr[]) {

        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i -1;

            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp; // chen
        }
    }

    public static void  display(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }


    public static void main(String[] args) {
        int [] arr = {1,5,3,4,8,7,9,10,26,11};
        insert(arr);
        display(arr);
    }
}
