public class DataInput {
    private String name;
    private String surname;
    private double payment;

    DataInput(String name, String surname, double payment) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;

        DataCalculation.showPayment(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "New Person : {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", payment=" + payment +
                '}';
    }
}