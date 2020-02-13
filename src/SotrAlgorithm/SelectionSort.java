package SotrAlgorithm;
//Bước 1: i=1.
//Bước 2: So sanh a[i] voi cac phan tu con lai trong day de tìm phần tử a[min] nhỏ nhất trong dãy hiện hành từ a[i] đến a[n].
//Bước 3: Hoán vị a[min] và a[i]
//Bước 4: Nếu i<=n-1 thì i=i+1; Lặp lại bước 2.
//Ngược lại: Dừng. n-1 phần tử đã nằm đúng vị trí.
public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            int minValue = arr[i];

            for(int j=i+1; j< arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex!=i) {
                arr[i] = arr[minIndex];
                arr[minIndex] = minValue;
            }

        }
    }
    public static void  display(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,5,3,4,8,7,9,12,10,26,11};
        selectionSort(arr);
        display(arr);
    }

}
