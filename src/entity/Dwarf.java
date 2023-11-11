package entity;

import java.util.LinkedList;
import java.util.List;

public class Dwarf
{
    private String name;
    private FacialHair facialHair;
    private List<Weapon> weapons = new LinkedList<>();
    private String lunch;
    private int dwarfAge;

    public Dwarf()
    {
    }

    public Dwarf(String name, int dwarfAge)
    {
        this.name = name;
        this.dwarfAge = dwarfAge;
    }

    public String getName() {
        return name;
    }

    public int getDwarfAge() {
        return dwarfAge;
    }

    public FacialHair getFacialHair() {
        return facialHair;
    }

    public void setDwarfAge(int dwarfAge) {
        this.dwarfAge = dwarfAge;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public String getLunch() {
        return lunch;
    }

    public void setFacialHair(FacialHair facialHair) {
        this.facialHair = facialHair;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void addWeapon(Weapon mace) {
        weapons.add(mace);
    }
}

