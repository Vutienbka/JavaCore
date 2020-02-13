package SotrAlgorithm;
//Chọn phần tử chốt.
//Khai báo 2 biến con trỏ để trỏ để duyệt 2 phía của phần tử chốt.
//Biến bên trái trỏ đến từng phần tử mảng con bên trái của phần tử chốt.
//Biến bên phải trỏ đến từng phần tử mảng con bên phải của phần tử chốt.

//Khi biến bên trái nhỏ hơn phần tử chốt thì di chuyển sang phải.
//Khi biến bên phải lon hơn phần tử chốt thì di chuyển sang trái.
//Nếu không xảy ra trưởng hợp 5 và 6 thì tráo đổi giá trị 2 biến trái và phải.

//Nếu trái lơn hơn phải thì đây là giá trị chốt mới.
public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int left = low;
        int right = high-1;

        while(true){
            while (left <= right && arr[left] < pivot) left++;
            while (right >= left && arr[right] > pivot) right--;
            if(left >=right)
                break;
            int temp = arr[left];
            arr[left] = arr[high];
            arr[high] = temp;
            left++;
            right--;
        }
        int temp;
        temp = arr[left];
        arr[left] = arr[high];
        arr[high] = temp;

        return left;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high)
        {
          int pivot = partition(arr, low, high);
          quickSort(arr,low,pivot-1);
          quickSort(arr,pivot + 1, high);
        }
    }
    public static void  display(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }


    public static void main(String[] args) {
        int [] arr = {1,5,3,4,8,7,9,10,26,11};
        partition(arr,0,arr.length-1);
        display(arr);
    }
}
