package entity;

public class FacialHair
{
    private boolean haveBeard;
    private boolean haveMustache;
    private String color;

    public FacialHair(boolean haveBeard, boolean haveMustache, String color)
    {
        this.haveBeard = haveBeard;
        this.haveMustache = haveMustache;
        this.color = color;
    }

    // getters & setters

    public boolean isHaveBeard() {
        return haveBeard;
    }

    public boolean isHaveMustache() {
        return haveMustache;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHaveBeard(boolean haveBeard) {
        this.haveBeard = haveBeard;
    }

    public void setHaveMustache(boolean haveMustache) {
        this.haveMustache = haveMustache;
    }
}

