package ExceptionInJava;

public class NeNgoaiLe {
        public static void main(String[] args) {
            try {
                divideNumber(1,0);
            }catch (ArithmeticException e) {   // Ham main nhan ngoai le
                System.out.println(e.getMessage());
            }
        }
        public static void divideNumber(int a, int b) throws ArithmeticException{
            //Scanner scanner = new Scanner(System.in);
            System.out.println("Result: " + a / b);
            // Mac du co ngoai le xay ra o day nhung phuong thuc khong muon thuc hien ngoai le o day thi nem ngoai le di cho ham main
        }

    }

