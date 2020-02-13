package SotrAlgorithm;
//Nó so sánh hai phần tử đầu, nếu phần tử đứng trước lớn hơn phần tử đứng sau thì đổi chỗ chúng cho nhau.
// Tiếp tục làm như vậy với cặp phần tử tiếp theo cho đến cuối tập hợp dữ liệu.
// Sau đó nó quay lại với hai phần tử đầu cho đến khi không còn cần phải đổi chỗ nữa.
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i< arr.length-1; i++)
            for(int j= 0; j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
        bubbleSort(arr);
        display(arr);
    }

}
