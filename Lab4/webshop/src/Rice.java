public class Rice extends Food {
    private int id;
    private String name;

    public Rice() {
    }

    public Rice(int id, String name) {
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
                "\t" + this.getClass().getSuperclass().getSimpleName();
    }
}
