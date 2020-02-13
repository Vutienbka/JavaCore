package MapInJava;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class CountWordInString {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String:");
        String string = scanner.nextLine();
        String[] stringArray = string.split(" ");
        System.out.println();
        for(int i =0; i<stringArray.length;i++){
            if(map.isEmpty()) {
                map.put(stringArray[i], 1);
            }
            else
            {
                Iterator<Map.Entry<String, Integer>> iteratorKey = map.entrySet().iterator();
                try{
                while (iteratorKey.hasNext()){
                        Map.Entry<String,Integer> currentEntry = iteratorKey.next();
                        if(stringArray[i].equals(currentEntry.getKey())) {
                            map.put(stringArray[i], (currentEntry.getValue().intValue()) + 1);
                            break;
                        }
                    map.put(stringArray[i], 1);
                    }

                }
                catch (Exception e ) {
                    System.out.println("Invalid");
                }
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet())
            System.out.println("key: " +entry.getKey() + "--> "+ "Value: " +entry.getValue());
    }
}
