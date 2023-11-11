package entity;

import java.util.List;

public class Animal {
    private String type;
    private double price;
    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + type + '\'' +
                ", age=" + price +
                ", position=" + Arrays.toString(position) +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }

}
