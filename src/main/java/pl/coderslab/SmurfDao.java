package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
    public List<Smurf> getList(){
        ArrayList <Smurf> list = new ArrayList<>();
        list.add(new Smurf("Smurf1", "atrybut1","opis1"));
        list.add(new Smurf("Smurf2", "atrybut2","opis2"));
        list.add(new Smurf("Smurf3", "atrybut3","opis3"));
        list.add(new Smurf("Smurf4", "atrybut4","opis4"));
        list.add(new Smurf("Smurf5", "atrybut5","opis5"));

        return list;
    }
}
