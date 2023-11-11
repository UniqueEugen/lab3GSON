package entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import myLibrary.console.Console;

import java.util.LinkedList;
import java.util.List;

public class DwarvesBand {
    List<Dwarf> dwarves = new LinkedList<>();
    public DwarvesBand(){}
    public DwarvesBand(Dwarf dwarf){
        addDwarf(dwarf);
    }
    public DwarvesBand(List<Dwarf> dwarves){
        setDwarves(dwarves);
    }
    public void setDwarves(List<Dwarf> dwarves) {
        this.dwarves = dwarves;
    }
    public List<Dwarf> getDwarves()
    {
        return new LinkedList<>(dwarves);
    }


    public void addDwarf(Dwarf tmpDwarf) {
        dwarves.add(tmpDwarf);
    }
    @Override
    public String toString(){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Console.log(gson.toJson(dwarves));
        return null;
    }
}
