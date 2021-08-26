import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int ageVasya= sc.nextInt();
        Person person1 = new Person(name, ageVasya);
        person1.setName("Emanuil");
        System.out.println(person1.getName());
        ArrayList<Person> cheloveki = new ArrayList<>();
        cheloveki.add(person1);
        cheloveki.add(new Person("Kolya", 28));
        school(cheloveki);
        for (Person p2 : cheloveki) {
            System.out.println(p2.isSchooler());
        }
    }

    public static void school(ArrayList<Person> personu) {
        for (Person p1: personu) {
           if (p1.getAge()<= 18 && p1.getAge() >= 7){
               p1.setSchooler(true);
           }
        }
    }
}


