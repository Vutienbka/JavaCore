package ArrayList_UseComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1, "A"));
        list.add(new Person(5, "C"));
        list.add(new Person(3, "E"));
        list.add(new Person(8, "D"));
        list.add(new Person(7, "B"));

        Collections.sort(list);
        for(Person person : list)
            System.out.println(person.getId() + person.getName());
    }
}
