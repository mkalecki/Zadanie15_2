import java.util.*;

public class test {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Janek", "Kowalski"));
        persons.add(new Person("Adam", "Nawałka"));
        persons.add(new Person("Dariusz", "Boczek"));
        persons.add(new Person("Zenek", "Smetana"));
        persons.add(new Person("Tomek", "Adamczyk"));

          System.out.println("Nasza lista: " + persons.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("po czym sortujemy tablicę?");
        System.out.println("1-imiona rosnąco, 2-imiona malejąco, 3-nazwiska rosnąco, 4-nazwiska malejąco");
        int decision = scanner.nextInt();
        switch (decision) {
            case 1:
                Collections.sort(persons, new FirstNameComparator());
                break;
            case 2:
                Collections.sort(persons, new FirstNameInvertComparator());
                break;
            case 3:
                Collections.sort(persons, new LastNameComparator());
                break;
            case 4:
                Collections.sort(persons, new LastNameInvertComparator());
                break;
            default:
                System.out.println("Nie ma takiej opcji");

        }

        System.out.println("Posortowane:" + persons.toString());



    }
}
