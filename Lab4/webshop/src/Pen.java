public class Pen extends Stationary {
    private int id;
    private String name;

    public Pen() {
    }

    public Pen(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\t" + id +
                "\t" + name +
                "\t\t" + this.getClass().getSuperclass().getSimpleName();
    }
}
