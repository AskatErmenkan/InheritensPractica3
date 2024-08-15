public class Vsadniki extends Spartance{
    int at4any;

    public Vsadniki(String name, int count, int at4any) {
        super(name, count);
        this.at4any = at4any;
    }

    @Override
    public String toString() {
        return "Vsadniki{" + super.toString() +
                "at4any=" + at4any +
                '}';
    }
}
