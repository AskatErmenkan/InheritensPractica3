public class Filosofy extends Spartance{
    private String gender;

    public Filosofy(String name, int count, String gender) {
        super(name, count);
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Filosofy{" + super.toString() +
                "gender='" + gender + '\'' +
                '}';
    }
}
