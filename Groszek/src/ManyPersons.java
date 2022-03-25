import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ManyPersons {
    private final Map<String, DataInput> nameToPerson;

    ManyPersons(Collection<DataInput> dataInputCollection){
        nameToPerson = new HashMap<>();
        dataInputCollection.forEach(person -> nameToPerson.put(person.getName(), person));
    }

    public Collection<DataInput> showPersons(){
        return nameToPerson.values();
    }
}
