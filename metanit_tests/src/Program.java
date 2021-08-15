public class Program {
    public static void main(String[] args) {

        Person kate = new Person("Kate");
        System.out.println(kate.getName());
        Person.changeName(kate);
        System.out.println(kate.getName());
    }
}
