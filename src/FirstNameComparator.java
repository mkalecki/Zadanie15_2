import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null && o2 != null)
            return -1;
        if (o1 != null && o2 == null)
            return 0;

        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
