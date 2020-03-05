public class test {
    String name;
    int id;

    public test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
