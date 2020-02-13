package GenericInJava;

public class GenericMethod {
    //    public void show(Object[] objects){
//        for(Object object : objects)
//        {
//            System.out.println(object);
//        }
//    }

    public <T> void show(T[] objects)
    {
        for(T object : objects)
        {
            System.out.println(object);
        }
    }

    public <K,V extends Comparable<K>> void showKey(K key, V value) {
        System.out.println(key);
    }
//    public <Integer>Integer showKey1(Integer key){
//        return key ;
//
//    }
    public <T extends Comparable<T>>T findMax(T[] arr){
        T max = arr[0];
        for(T t: arr){
           if (t.compareTo(max)>0)
                    max = t;
        }
        return max;
    }

    // K, V chi la ca kieu du lieu tham chieu
    //Nen khi thuc hien cac thao tac trong lap trinh nhu: cong tru, so sanh thi phai khai bao boi kieu du lieu cu the
    // Hoac ke thua mot lop cu the cho phep thao tac voi du lieu
    public static void main(String[] args) {
        Integer[] integer = {1,2,3,4,5,6};
        String[] strings = {"mammal","dog","animal"};
        Double[] doubles = {1.2, 2.3, 3.5};

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.show(integer);
        genericMethod.show(strings);
        genericMethod.show(doubles);
    }

}
