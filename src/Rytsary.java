public class Rytsary extends Spartance{
    String jooAsker;

    public Rytsary(String name, int count, String jooAsker) {
        super(name, count);
        this.jooAsker = jooAsker;
    }

    @Override
    public String toString() {
        return "Rytsary{" + super.toString() +
                "jooAsker='" + jooAsker + '\'' +
                '}';
    }
}
