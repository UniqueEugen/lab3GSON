package entity;

public class Weapon
{
    private String type;

    public Weapon()
    {
        // do nothing
    }

    public Weapon(String type)
    {
        this.type = type;
    }

    // getters & setters

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}