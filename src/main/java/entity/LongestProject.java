package entity;

public class LongestProject {
    private int id;
    private int months;

    public LongestProject(int id, int months) {
        this.id = id;
        this.months = months;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "LongestProject{" +
                "id=" + id +
                ", months=" + months +
                '}';
    }
}
