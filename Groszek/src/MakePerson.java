public class MakePerson {
    DataInput input;

    public DataInput makePerson(String name, String surname, double payment){
        if(input==null) {
            input = new DataInput(name, surname, payment);
            return input;
        }
        return input;
    }

}
