public class Lu4niki extends Spartance{

    private String vec;

    public Lu4niki(String name, int count, String vec) {
        super(name, count);
        this.vec = vec;
    }


    @Override
    public String toString() {
        return "Lu4niki {" + super.toString() +
                "vec = '" + vec + '\'' +
                '}';
    }
}
