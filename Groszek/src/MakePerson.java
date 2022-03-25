import java.util.ArrayList;
import java.util.Collection;

public class MakePerson {
    private DataInput input;
    private final Collection<DataInput> noneMadeThem = new ArrayList<>();

    public DataInput makePerson(String name, String surname, double payment){
        if(input!=null) {
            noneMadeThem.add(new DataInput(name, surname, payment));
            return input;
        }
        input = new DataInput(name, surname, payment);
        return input;
    }

    public void showUnmadePersons(){
        var manyPersons = new ManyPersons(noneMadeThem);
    }

}
