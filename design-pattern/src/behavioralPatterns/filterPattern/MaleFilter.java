package behavioralPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements PersonFilter {
    @Override
    public List<Person> filter(List<Person> personList) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person person : personList) {
            if ("MALE".equals(person.getGender())) {
                result.add(person);
            }
        }
        return result;
    }
}
