public class DataCalculation {
    public final static double TAX_NUMBER = 0.7;

    public static void showPayment(DataInput person){
        var personPayment = calculateTax(person);
        System.out.print("Kalkulujemy wypłatę dla : " + person.getName());
        System.out.println(" " + person.getSurname());
        System.out.println(personPayment);

    }
    private static int calculateTax(DataInput person){
        return (int) (person.getPayment() * TAX_NUMBER);
    }
}
