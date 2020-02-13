package ArrayList_UseComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "A"));
        list.add(new Person(5, "C"));
        list.add(new Person(7, "E"));
        list.add(new Person(3, "D"));
        list.add(new Person(6, "B"));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getId() > person2.getId() ? 1 : -1;
            }
        });

        for(Person person : list)
            System.out.println(person.getId() + person.getName());
    }

}
