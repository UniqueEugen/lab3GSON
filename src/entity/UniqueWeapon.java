package entity;

public class UniqueWeapon extends Weapon {
    private String name;
    private String origin;

    public UniqueWeapon() {
        super();
    }

    public UniqueWeapon(String type, String name, String origin) {
        super(type);
        this.name = name;
        this.origin = origin;
    }

    // getters & setters

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

