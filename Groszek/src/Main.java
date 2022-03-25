public class Main {
    public static void main(String[] args) {
       MakePerson person = new MakePerson();
        var dataInput = person.makePerson("Andrzej", "Bronkowski", 10000.50);

        dataInput = person.makePerson("Pawel", "Gryta", 5050.50);
        System.out.println(dataInput);

        dataInput = person.makePerson("Zosia", "Samosia", 999999);

        System.out.println(dataInput);
    }
}
