public class Spartance {
    private String name;
    private int count;

    public Spartance(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Spartance{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
